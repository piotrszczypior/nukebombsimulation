package com.example.nukebombsimulation.calculations;

import com.example.nukebombsimulation.properties.ApplicationProperties;
import com.typesafe.config.ConfigFactory;

public class MainRadiusCalculator implements IRadiusCalculator{

    private final double PARAMETER;
    private final double energy;
    private final RadiusFormula radius;
    private final EnergyParser parser;

    public MainRadiusCalculator() {
        ApplicationProperties applicationProperties = new ApplicationProperties(ConfigFactory.load());
        if(applicationProperties.isAirburst()){
            PARAMETER = 16.48;
        }
        else{
            PARAMETER = 14.09;
        }
        this.radius = new RadiusFormula();
        this.parser = new EnergyParser();
        this.energy = parser.parse(applicationProperties.getYield());
    }

    @Override
    public double calculateRadius() {
        return PARAMETER * radius.calculate(energy);
    }

    @Override
    public double calculateRadius(double bombMass) {
        return PARAMETER * radius.calculate(parser.parse(bombMass));
    }
}
