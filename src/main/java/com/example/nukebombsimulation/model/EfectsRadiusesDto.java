package com.example.nukebombsimulation.model;

public class EfectsRadiusesDto {
    private static double fireballRadius;
    private static double heavyBlastDamageRadius;
    private static double radiationRadius;
    private static double averageBlastDamageRadius;
    private static double thermalRadiationRadius;
    private static double lightBlastDamageRadius;

    public static double getFireballRadius() {
        return fireballRadius;
    }

    public static void setFireballRadius(double fireballRadius) {
        EfectsRadiusesDto.fireballRadius = fireballRadius;
    }

    public static double getRadiationRadius() {
        return radiationRadius;
    }

    public static void setRadiationRadius(double radiationRadius) {
        EfectsRadiusesDto.radiationRadius = radiationRadius;
    }

    public static double getHeavyBlastDamageRadius() {
        return heavyBlastDamageRadius;
    }

    public static void setHeavyBlastDamageRadius(double heavyBlastDamageRadius) {
        EfectsRadiusesDto.heavyBlastDamageRadius = heavyBlastDamageRadius;
    }

    public static double getAverageBlastDamageRadius() {
        return averageBlastDamageRadius;
    }

    public static void setAverageBlastDamageRadius(double averageBlastDamageRadius) {
        EfectsRadiusesDto.averageBlastDamageRadius = averageBlastDamageRadius;
    }

    public static double getLightBlastDamageRadius() {
        return lightBlastDamageRadius;
    }

    public static void setLightBlastDamageRadius(double lightBlastDamageRadius) {
        EfectsRadiusesDto.lightBlastDamageRadius = lightBlastDamageRadius;
    }

    public static double getThermalRadiationRadius() {
        return thermalRadiationRadius;
    }

    public static void setThermalRadiationRadius(double thermalRadiationRadius) {
        EfectsRadiusesDto.thermalRadiationRadius = thermalRadiationRadius;
    }

}
