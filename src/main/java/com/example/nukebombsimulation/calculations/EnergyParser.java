package com.example.nukebombsimulation.calculations;

public class EnergyParser {
    private static final int energy = 1000000;

    public int parse(int bombMass){
        return bombMass * energy;
    }
}
