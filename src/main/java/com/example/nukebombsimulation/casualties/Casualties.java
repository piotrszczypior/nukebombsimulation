package com.example.nukebombsimulation.casualties;

import com.example.nukebombsimulation.dto.EffectsRadiusesDto;

public class Casualties {

    private static final double HEAVY_BLAST_DAMAGE_RATIO = 1;
    private static final double AVERAGE_BLAST_DAMAGE_RATIO = 0.7;
    private static final double LIGHT_BLAST_DAMAGE_RATIO = 0.3;
    private final double totalPopulation;
    private final EffectsRadiusesDto efectsRadiusesDto;

    public Casualties(double population, EffectsRadiusesDto efectsRadiusesDto) {
        this.totalPopulation = population;
        this.efectsRadiusesDto = efectsRadiusesDto;
    }

    public double populationOnHeavyBlastDamage(){
        return totalPopulation * (efectsRadiusesDto.getHeavyBlastDamageRadius()/efectsRadiusesDto.getLightBlastDamageRadius());
    }
    public double heavyBlastDamageFatalities() {
        return populationOnHeavyBlastDamage() * HEAVY_BLAST_DAMAGE_RATIO;
    }
    public double populationOnAverageBlastDamage(){
        return (totalPopulation - populationOnHeavyBlastDamage()) * (efectsRadiusesDto.getHeavyBlastDamageRadius()/efectsRadiusesDto.getLightBlastDamageRadius());
    }
    public double averageBlastDamageFatalities() {
        return populationOnAverageBlastDamage() * AVERAGE_BLAST_DAMAGE_RATIO;
    }
    public double populationOnLightBlastDamage(){
        return (totalPopulation - populationOnHeavyBlastDamage() - populationOnAverageBlastDamage()) * efectsRadiusesDto.getHeavyBlastDamageRadius()/efectsRadiusesDto.getLightBlastDamageRadius();
    }
    public double lightBlastDamageFatalities() {
        return populationOnLightBlastDamage() * LIGHT_BLAST_DAMAGE_RATIO;
    }
    public double getAllFatalities(){
        return heavyBlastDamageFatalities() + averageBlastDamageFatalities() + lightBlastDamageFatalities();
    }
    public double getAllInjuries(){
        return (totalPopulation - getAllFatalities()) * 0.95;
    }
}
