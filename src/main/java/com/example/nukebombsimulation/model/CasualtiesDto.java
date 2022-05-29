package com.example.nukebombsimulation.model;

public class CasualtiesDto {
    private static double estimatedFatalities;
    private static double estimatedInjuries;

    public static double getEstimatedFatalities() {
        return estimatedFatalities;
    }

    public static void setEstimatedFatalities(double estimatedFatalities) {
        CasualtiesDto.estimatedFatalities = estimatedFatalities;
    }

    public static double getEstimatedInjuries() {
        return estimatedInjuries;
    }

    public static void setEstimatedInjuries(double estimatedInjuries) {
        CasualtiesDto.estimatedInjuries = estimatedInjuries;
    }
}
