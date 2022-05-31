package com.example.nukebombsimulation.dto;

public class CasualtiesDto {
    private double estimatedFatalities;
    private double estimatedInjuries;

    public double getEstimatedFatalities() {
        return estimatedFatalities;
    }

    public void setEstimatedFatalities(double estimatedFatalities) {
        this.estimatedFatalities = estimatedFatalities;
    }

    public double getEstimatedInjuries() {
        return estimatedInjuries;
    }

    public void setEstimatedInjuries(double estimatedInjuries) {
        this.estimatedInjuries = estimatedInjuries;
    }
}
