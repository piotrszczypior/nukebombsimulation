package com.example.nukebombsimulation.casualties;

import com.example.nukebombsimulation.calculations.IRadiusCalculator;

public class Casualties implements ICasualties{
    private double population;
    private double bombMass;
    private double radius;

    private final double fireballRatio = 0.1;
    private final double thermalRatio = 0.35;
    private final double blastRatio = 0.5;
    private final double radiationRatio = 0.15;

    private final IRadiusCalculator radiusCalculator;

    public Casualties(double population, double bombMass, IRadiusCalculator radiusCalculator) {
        this.population = population;
        this.bombMass = bombMass;
        this.radiusCalculator = radiusCalculator;
        this.radius = radiusCalculator.calculateRadius();
    }

    @Override
    public double fireballCasualties() {
        return population * radiusCalculator.calculateRadius((bombMass*fireballRatio)/ radius);
    }

    @Override
    public double thermalRadiationCasualties() {
        double casualtiesRatio = 0.9;
        double area = radiusCalculator.calculateRadius((bombMass* thermalRatio)) - radiusCalculator.calculateRadius(bombMass*radiationRatio);

        return (casualtiesRatio * population * area/ radius);
    }

    @Override
    public double blastDamageCasualties() {
        double casualtiesRatio = 0.85;
        double area = radiusCalculator.calculateRadius((bombMass* blastRatio)) - radiusCalculator.calculateRadius(bombMass* thermalRatio);

        return (casualtiesRatio * population * area)/ radius;
    }

    @Override
    public double radiationCasualties() {
        double casualtiesRatio = 0.7;
        double area = radiusCalculator.calculateRadius((bombMass* radiationRatio)) - radiusCalculator.calculateRadius(bombMass* fireballRatio);

        return (casualtiesRatio * population * area)/ radius;
    }
}
