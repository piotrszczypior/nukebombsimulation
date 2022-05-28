package com.example.nukebombsimulation.casulties;

import com.example.nukebombsimulation.calculations.IRadiusCalculator;

public class Casualties implements ICasualties{
    int population;
    int bombMass;
    double radius;

    double fireballRatio = 0.1;
    double thermalRatio = 0.35;
    double blastRatio = 0.5;
    double radiationRatio = 0.15;

    IRadiusCalculator radiusCalculator;

    public Casualties(int population, int bombMass, IRadiusCalculator radiusCalculator) {
        this.population = population;
        this.bombMass = bombMass;
        this.radiusCalculator = radiusCalculator;
        this.radius = radiusCalculator.calculateRadius();
    }

    @Override
    public int fireballCasualties() {
        return (int) Math.floor(population* radiusCalculator.calculateRadius((int) (bombMass*fireballRatio))/ radius);
    }

    @Override
    public int thermalRadiationCasualties() {
        double casualtiesRatio = 0.9;
        double area = radiusCalculator.calculateRadius((int) (bombMass* thermalRatio)) - radiusCalculator.calculateRadius((int) (bombMass*radiationRatio));

        return (int) (Math.floor(casualtiesRatio * population * area/ radius));
    }

    @Override
    public int blastDamageCasualties() {
        double casualtiesRatio = 0.85;
        double area = radiusCalculator.calculateRadius((int) (bombMass* blastRatio)) - radiusCalculator.calculateRadius((int) (bombMass* thermalRatio));

        return (int) (Math.floor(casualtiesRatio * population * area)/ radius);
    }

    @Override
    public int radiationCasualties() {
        double casualtiesRatio = 0.7;
        double area = radiusCalculator.calculateRadius((int) (bombMass* radiationRatio)) - radiusCalculator.calculateRadius((int) (bombMass* fireballRatio));

        return (int) (Math.floor(casualtiesRatio * population * area)/ radius);
    }
}
