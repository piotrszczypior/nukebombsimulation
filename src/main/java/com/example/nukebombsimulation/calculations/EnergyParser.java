package com.example.nukebombsimulation.calculations;

public class EnergyParser {
    private static final int ENERGY = 1000000;

    public double parse(double bombMass){
        return bombMass * ENERGY;
    }
}
