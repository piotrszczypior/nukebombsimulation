package com.example.nukebombsimulation.casulties;

public class Casulties implements ICasulties{
    int population;

    public Casulties(int population) {
        this.population = population;
    }


    @Override
    public int fireballCasualties() {
        return 0;
    }

    @Override
    public int thermalRadiationCasualties() {
        return 0;
    }

    @Override
    public int blastDamageCasualties() {
        return 0;
    }

    @Override
    public int radiationCasualties() {
        return 0;
    }
}
