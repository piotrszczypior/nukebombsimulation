package com.example.nukebombsimulation.builder;

import com.example.nukebombsimulation.calculations.AllRadiusesCalculator;
import com.example.nukebombsimulation.calculations.MainRadiusCalculator;
import com.example.nukebombsimulation.casualties.Casualties;
import com.example.nukebombsimulation.dto.CasualtiesDto;
import com.example.nukebombsimulation.geojson.GeoJsonCreator;
import com.example.nukebombsimulation.model.Bomb;
import com.example.nukebombsimulation.model.Result;
import com.example.nukebombsimulation.webclient.client.PopulationClient;

public class ResultBuilder {
    private final PopulationClient populationClient;


    public ResultBuilder(PopulationClient populationClient) {
        this.populationClient = populationClient;
    }

    public Result SetResult(Bomb bomb){
        GeoJsonCreator geoJsonCreator = new GeoJsonCreator(bomb);
        float population = populationClient.getPopulation(geoJsonCreator.getGeoJSON());
        double mainRadius = new MainRadiusCalculator(bomb.isAirBurst(), bomb.getYield()).calculateRadius();

        AllRadiusesCalculator allRadiusesCalculator = new AllRadiusesCalculator((int) mainRadius);
        var radiuses  = allRadiusesCalculator.SetAllRadiuses();
        Casualties casualties = new Casualties(population, radiuses);
        CasualtiesDto casualtiesDto = new CasualtiesDto();
        casualtiesDto.setEstimatedFatalities(casualties.getAllFatalities());
        casualtiesDto.setEstimatedInjuries(casualties.getAllInjuries());
        return new Result(casualtiesDto,radiuses, bomb);
    }
}
