package com.example.nukebombsimulation;

import com.example.nukebombsimulation.fileutilities.FileReader;
import com.example.nukebombsimulation.geojson.GeoJsonCreator;
import com.example.nukebombsimulation.model.PopulationDto;
import com.example.nukebombsimulation.properties.ApplicationProperties;
import com.example.nukebombsimulation.service.BombService;
import com.example.nukebombsimulation.webclient.client.PopulationClient;
import com.typesafe.config.ConfigFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        ApplicationProperties applicationProperties = new ApplicationProperties(ConfigFactory.load());
//        String filePath = "properties.txt";
        FileReader fileReader = new FileReader();
        GeoJsonCreator geoJsonCreator = new GeoJsonCreator();
//        for(ApplicationProperties applicationProperties1 : fileReader.downloadData(filePath)){
//            GeoJsonCreator geoJsonCreator = new GeoJsonCreator(applicationProperties1);
//
//            //hardcodowane printowanie
//            System.out.println(geoJsonCreator.getGeoJSON());
//            BombService bombService = new BombService(new PopulationClient(), geoJsonCreator);
//            PopulationDto populationDto = bombService.getPopulation();
//            System.out.println(populationDto.getPopulation());
//        }


    }

}
