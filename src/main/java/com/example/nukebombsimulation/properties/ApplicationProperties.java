package com.example.nukebombsimulation.properties;


import com.typesafe.config.Config;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Objects;

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

    public ApplicationProperties(String[] properties) {
        this.latitude = Double.parseDouble(properties[0]);
        this.longitude = Double.parseDouble(properties[1]);
        this.yield = Integer.parseInt(properties[2]);
        this.airburst = Objects.equals(properties[3], "true");
    }
}
