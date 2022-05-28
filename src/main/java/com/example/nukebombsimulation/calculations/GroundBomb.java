package com.example.nukebombsimulation.calculations;

public class GroundBomb implements IRadiusCalculator
{
    private final static double GROUND_DETONATION = 9.8;

    Radius radius = new Radius();
    EnergyParser parser = new EnergyParser();

    private final int energy;

    public GroundBomb(int bombMass) {
        this.energy = parser.parse(bombMass);
    }

    @Override
    public double calculateRadius() {
        return  GROUND_DETONATION * radius.calculate(energy);
    }

    @Override
    public double calculateRadius(int bombMass) {
        return GROUND_DETONATION * radius.calculate(parser.parse(bombMass));
    }
}
