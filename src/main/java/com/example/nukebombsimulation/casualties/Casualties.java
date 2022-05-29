package com.example.nukebombsimulation.casualties;

import com.example.nukebombsimulation.calculations.AllRadiusesCalculator;
import com.example.nukebombsimulation.model.EfectsRadiusesDto;

public class Casualties {
    private final double totalPopulation;

    private static final double heavyBlastDamageRatio = 1;

    private static final double averageBlastDamageRatio = 0.7;

    private static final double lightBlastDamageRatio = 0.3;
    private final EfectsRadiusesDto efectsRadiusesDto;

    public Casualties(double population) {
        this.totalPopulation = population;
        AllRadiusesCalculator allRadiusesCalculator = new AllRadiusesCalculator();
        this.efectsRadiusesDto = allRadiusesCalculator.SetAllRadiuses();

    }

    public double populationOnHeavyBlastDamage(){
        return totalPopulation * (efectsRadiusesDto.getHeavyBlastDamageRadius()/efectsRadiusesDto.getLightBlastDamageRadius());
    }
    public double heavyBlastDamageFatalities() {
        return populationOnHeavyBlastDamage() * heavyBlastDamageRatio;
    }
    public double populationOnAverageBlastDamage(){
        return (totalPopulation - populationOnHeavyBlastDamage()) * (efectsRadiusesDto.getHeavyBlastDamageRadius()/efectsRadiusesDto.getLightBlastDamageRadius());
    }
    public double averageBlastDamageFatalities() {
        return populationOnAverageBlastDamage() * averageBlastDamageRatio;
    }
    public double populationOnLightBlastDamage(){
        return (totalPopulation - populationOnHeavyBlastDamage() - populationOnAverageBlastDamage()) * efectsRadiusesDto.getHeavyBlastDamageRadius()/efectsRadiusesDto.getLightBlastDamageRadius();
    }
    public double lightBlastDamageFatalities() {
        return populationOnLightBlastDamage() * lightBlastDamageRatio;
    }
    public double getAllFatalities(){
        return heavyBlastDamageFatalities() + averageBlastDamageFatalities() + lightBlastDamageFatalities();
    }
    public double getAllInjuries(){
        return (totalPopulation - getAllFatalities()) * 0.95;
    }
}