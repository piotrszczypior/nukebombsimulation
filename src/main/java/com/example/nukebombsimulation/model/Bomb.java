package com.example.nukebombsimulation.model;


public class Bomb {
    private int id;
    private double latitude;
    private double longitude;
    private int yield;
    private boolean airBurst;


    public Bomb(int id, double latitude, double longitude, int yield, boolean airBurst) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.yield = yield;
        this.airBurst = airBurst;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getYield() {
        return yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }

    public boolean isAirBurst() {
        return airBurst;
    }

    public void setAirBurst(boolean airBurst) {
        this.airBurst = airBurst;
    }
}
