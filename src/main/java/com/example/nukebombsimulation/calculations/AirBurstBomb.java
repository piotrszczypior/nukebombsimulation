package com.example.nukebombsimulation.calculations;

public class AirBurstBomb implements IRadiusCalculator{
    private static final int AirBurstEnergy = 50;

    private final int energy;

    public AirBurstBomb(int bombMass) {
        EnergyParser parser = new EnergyParser();
        this.energy = parser.parse(bombMass);
    }

    @Override
    public double calculateRadius() {
        Radius radius = new Radius();
        return  AirBurstEnergy * radius.calculate(energy);
    }

    @Override
    public double calculateRadius(int bombMass) {
        Radius radius = new Radius();
        return AirBurstEnergy * radius.calculate(new EnergyParser().parse(bombMass));
    }
}

