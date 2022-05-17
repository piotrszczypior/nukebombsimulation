package com.example.nukebombsimulation.properties;


import com.typesafe.config.Config;
import lombok.Data;

@Data
public class ApplicationProperties {
    private final double latitude;
    private final double longitude;
    private final int yield;
    private final boolean airburst;

    public ApplicationProperties(Config config) {
        this.latitude = config.getDouble("latitude");
        this.longitude = config.getDouble("longitude");
        this.yield = config.getInt("yield");
        this.airburst = config.getBoolean("airburst");
    }
}
