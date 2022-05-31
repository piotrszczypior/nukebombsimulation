package com.example.nukebombsimulation.calculations;

import com.example.nukebombsimulation.dto.EffectsRadiusesDto;


public class AllRadiusesCalculator {
    private final double mainRadius;
    private final EffectsRadiusesDto efectsRadiusesDto;

    public AllRadiusesCalculator(int mainRadius) {
        this.mainRadius = mainRadius;
        this.efectsRadiusesDto = new EffectsRadiusesDto();
    }

    public EffectsRadiusesDto SetAllRadiuses(){
        efectsRadiusesDto.setLightBlastDamageRadius(mainRadius);
        efectsRadiusesDto.setThermalRadiationRadius(mainRadius*0.868);
        efectsRadiusesDto.setAverageBlastDamageRadius(mainRadius*0.39);
        efectsRadiusesDto.setRadiationRadius(mainRadius*0.236);
        efectsRadiusesDto.setHeavyBlastDamageRadius(mainRadius*0.186);
        efectsRadiusesDto.setFireballRadius(mainRadius*0.104);
        return efectsRadiusesDto;
    }


}
