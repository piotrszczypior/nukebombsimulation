package com.example.nukebombsimulation.calculations;

public class AirBurstBomb implements IRadiusCalculator{
    private static final int AirBurstEnergy = 50;

    Radius radius = new Radius();
    EnergyParser parser = new EnergyParser();

    private final int energy;

    public AirBurstBomb(int bombMass) {
        this.energy = parser.parse(bombMass);
    }

    @Override
    public double calculateRadius() {
        return  AirBurstEnergy * radius.calculate(energy);
    }

    @Override
    public double calculateRadius(int bombMass) {
        return AirBurstEnergy * radius.calculate(parser.parse(bombMass));
    }
}

