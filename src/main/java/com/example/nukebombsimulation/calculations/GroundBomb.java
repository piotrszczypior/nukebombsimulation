package com.example.nukebombsimulation.calculations;

public class GroundBomb implements IRadiusCalculator
{
    private final static double GROUND_DETONATION = 9.8;

    private final int energy;

    public GroundBomb(int bombMass) {
        EnergyParser parser = new EnergyParser();
        this.energy = parser.parse(bombMass);
    }

    @Override
    public double calculateRadius() {
        Radius radius = new Radius();
        return  GROUND_DETONATION * radius.calculate(energy);
    }

    @Override
    public double calculateRadius(int bombMass) {
        return GROUND_DETONATION * new Radius().calculate(new EnergyParser().parse(bombMass));
    }
}
