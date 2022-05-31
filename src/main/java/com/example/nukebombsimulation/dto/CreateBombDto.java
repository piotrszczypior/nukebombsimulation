package com.example.nukebombsimulation.dto;

public class CreateBombDto {

    private double latitude;
    private double longitude;
    private int yield;
    private boolean airBurst;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getYield() {
        return yield;
    }

    public boolean isAirBurst() {
        return airBurst;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }

    public void setAirBurst(boolean airBurst) {
        this.airBurst = airBurst;
    }
}
