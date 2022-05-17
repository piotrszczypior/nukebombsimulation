package com.example.nukebombsimulation;

import com.example.nukebombsimulation.geojson.GeoJsonCreator;
import com.example.nukebombsimulation.properties.ApplicationProperties;
import com.typesafe.config.ConfigFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ApplicationProperties applicationProperties1 = new ApplicationProperties(ConfigFactory.load());
        GeoJsonCreator geoJsonCreator = new GeoJsonCreator();
        System.out.println(geoJsonCreator.getGeoJSON());

    }

}
