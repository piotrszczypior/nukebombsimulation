package com.example.nukebombsimulation.service;
import com.example.nukebombsimulation.geojson.GeoJsonCreator;
import com.example.nukebombsimulation.model.PopulationDto;
import com.example.nukebombsimulation.webclient.client.PopulationClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BombService {

    private final PopulationClient populationClient;
    private final GeoJsonCreator geoJsonCreator;


    public PopulationDto getPopulation(){
        System.out.println(geoJsonCreator.getGeoJSON());
        return populationClient.getPopulation(geoJsonCreator.getGeoJSON());
    }
}
