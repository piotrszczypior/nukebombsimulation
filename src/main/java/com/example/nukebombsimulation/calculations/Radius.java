package com.example.nukebombsimulation.calculations;

class Radius {

    double calculate(int energy)
    {
        return  ((Math.pow(energy,0.333))/(Math.pow(1 + Math.pow((3175.0 / energy), 2), 1.0/6)));
    }
}
