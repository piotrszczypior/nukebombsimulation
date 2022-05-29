package com.example.nukebombsimulation.calculations;


import com.example.nukebombsimulation.model.EfectsRadiusesDto;

public class AllRadiusesCalculator {
    private final double mainRadius;
    public AllRadiusesCalculator(MainRadiusCalculator mainRadiusCalculator) {
        this.mainRadius = mainRadiusCalculator.calculateRadius();
        SetAllRadiuses();
    }

    private void SetAllRadiuses(){
        EfectsRadiusesDto.setLightBlastDamageRadius(mainRadius);
        EfectsRadiusesDto.setThermalRadiationRadius(mainRadius*0.868);
        EfectsRadiusesDto.setAverageBlastDamageRadius(mainRadius*0.39);
        EfectsRadiusesDto.setRadiationRadius(mainRadius*0.236);
        EfectsRadiusesDto.setHeavyBlastDamageRadius(mainRadius*0.186);
        EfectsRadiusesDto.setFireballRadius(mainRadius*0.104);
    }


}
