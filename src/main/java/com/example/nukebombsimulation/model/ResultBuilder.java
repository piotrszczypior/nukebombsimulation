package com.example.nukebombsimulation.model;

import com.example.nukebombsimulation.calculations.AllRadiusesCalculator;
import com.example.nukebombsimulation.casualties.Casualties;
import com.example.nukebombsimulation.dto.CasualtiesDto;

public class ResultBuilder {
    public static Result SetResult(float population, double mainRadius){
        AllRadiusesCalculator allRadiusesCalculator = new AllRadiusesCalculator((int) mainRadius);
        var radiuses  = allRadiusesCalculator.SetAllRadiuses();
        Casualties casualties = new Casualties(population, radiuses);

        CasualtiesDto casualtiesDto = new CasualtiesDto();

        casualtiesDto.setEstimatedFatalities(casualties.getAllFatalities());

        casualtiesDto.setEstimatedInjuries(casualties.getAllInjuries());

        return new Result(casualtiesDto,radiuses);
    }
}
