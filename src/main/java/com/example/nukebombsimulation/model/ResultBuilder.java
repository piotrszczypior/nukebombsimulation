package com.example.nukebombsimulation.model;

import com.example.nukebombsimulation.calculations.AllRadiusesCalculator;
import com.example.nukebombsimulation.casualties.Casualties;

public class ResultBuilder {
    public static Result SetResult(float population){
        AllRadiusesCalculator allRadiusesCalculator = new AllRadiusesCalculator();
        Casualties casualties = new Casualties(population);
        allRadiusesCalculator.SetAllRadiuses();
        CasualtiesDto casualtiesDto = new CasualtiesDto();
        casualtiesDto.setEstimatedFatalities(casualties.getAllFatalities());
        casualtiesDto.setEstimatedInjuries(casualties.getAllInjuries());
        return new Result(casualtiesDto,allRadiusesCalculator.SetAllRadiuses());
    }
}
