package com.example.nukebombsimulation.properties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {
    private final double latitude;
    private final double longitude;
    private final int yield;
    private final boolean airburst;

    public ApplicationProperties() {
        Config config = ConfigFactory.load();
        this.latitude = config.getDouble("latitude");
        this.longitude = config.getDouble("longitude");
        this.yield = config.getInt("yield");
        this.airburst = config.getBoolean("airburst");
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getYield() {
        return yield;
    }

    public boolean isAirburst() {
        return airburst;
    }


}
