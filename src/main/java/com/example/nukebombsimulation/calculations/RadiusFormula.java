package com.example.nukebombsimulation.calculations;

public class RadiusFormula {

    public double calculate(double energy)
    {
        return ((Math.pow(energy,0.333))/(Math.pow(1 + Math.pow((3175.0 / energy), 2), 1.0/6)));
    }
}
