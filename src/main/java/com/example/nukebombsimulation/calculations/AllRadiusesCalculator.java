package com.example.nukebombsimulation.calculations;

import com.example.nukebombsimulation.model.EfectsRadiusesDto;


public class AllRadiusesCalculator {
    private final double mainRadius;
    private final EfectsRadiusesDto efectsRadiusesDto;

    public AllRadiusesCalculator() {
        MainRadiusCalculator mainRadiusCalculator = new MainRadiusCalculator();
        this.mainRadius = mainRadiusCalculator.calculateRadius();
        this.efectsRadiusesDto = new EfectsRadiusesDto();
    }

    public EfectsRadiusesDto SetAllRadiuses(){
        efectsRadiusesDto.setLightBlastDamageRadius(mainRadius);
        efectsRadiusesDto.setThermalRadiationRadius(mainRadius*0.868);
        efectsRadiusesDto.setAverageBlastDamageRadius(mainRadius*0.39);
        efectsRadiusesDto.setRadiationRadius(mainRadius*0.236);
        efectsRadiusesDto.setHeavyBlastDamageRadius(mainRadius*0.186);
        efectsRadiusesDto.setFireballRadius(mainRadius*0.104);
        return efectsRadiusesDto;
    }


}
