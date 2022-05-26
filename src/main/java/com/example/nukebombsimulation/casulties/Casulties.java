package com.example.nukebombsimulation.casulties;

public class Casulties implements ICasulties{
    int population;

    public Casulties(int population) {
        this.population = population;
    }


    @Override
    public int fireballCasulties() {
        return 0;
    }

    @Override
    public int thermalRadiationCasulties() {
        return 0;
    }

    @Override
    public int blastDamageCasulties() {
        return 0;
    }

    @Override
    public int radiationCasulties() {
        return 0;
    }
}
