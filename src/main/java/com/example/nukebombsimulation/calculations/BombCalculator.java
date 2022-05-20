package com.example.nukebombsimulation.calculations;

public class BombCalculator implements IRadiusCalculator{
    private static final int TIME = 60;
    private static final float AIR_DENSITY = 1.2f;

    private final int energy;

    public BombCalculator(int bombMass) {
        EnergyParser parser = new EnergyParser();
        this.energy = parser.parse(bombMass);
    }


    @Override
    public int calculateRadius() {
        return (int) ((9.8*Math.pow(energy,0.333))/(Math.pow(1 + Math.pow((3175 / energy), 2), 1/6)));
    }
}

