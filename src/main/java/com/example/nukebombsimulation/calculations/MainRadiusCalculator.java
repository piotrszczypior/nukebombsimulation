package com.example.nukebombsimulation.calculations;

import com.example.nukebombsimulation.properties.ApplicationProperties;



public class MainRadiusCalculator implements IRadiusCalculator{

    private final double PARAMETER;
    private final double energy;
    private final RadiusFormula radius;

    private boolean isAirburst;
    private int yield;

    public MainRadiusCalculator(boolean isAirburst, int yield) {
        if(isAirburst){
            PARAMETER = 16.48;
        }
        else{
            PARAMETER = 14.09;
        }
        this.radius = new RadiusFormula();
        EnergyParser parser = new EnergyParser();
        this.energy = parser.parse(yield);
    }

    @Override
    public double calculateRadius() {
        return PARAMETER * radius.calculate(energy);
    }

}
