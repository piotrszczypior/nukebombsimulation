package com.example.nukebombsimulation.calculations;

public class AirBurstBomb implements IRadiusCalculator{
    private static final int AirBurstEnergy = 5;

    private final int energy;

    public AirBurstBomb(int bombMass) {
        EnergyParser parser = new EnergyParser();
        this.energy = parser.parse(bombMass);
    }


    @Override
    public double calculateRadius() {
        return  (AirBurstEnergy* (9.8*Math.pow(energy,0.333))/(Math.pow(1 + Math.pow((3175.00 / energy), 2), 1.0/6)));
    }
}

