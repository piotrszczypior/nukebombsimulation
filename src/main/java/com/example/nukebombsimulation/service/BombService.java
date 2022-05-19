package com.example.nukebombsimulation.service;
import com.example.nukebombsimulation.geojson.GeoJsonCreator;
import com.example.nukebombsimulation.model.PopulationDto;
import com.example.nukebombsimulation.webclient.client.PopulationClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class BombService {

    private PopulationClient populationClient;
    private GeoJsonCreator geoJsonCreator;


    public BombService(PopulationClient populationClient, GeoJsonCreator geoJsonCreator) {
        this.populationClient = populationClient;
        this.geoJsonCreator = geoJsonCreator;
    }

    public PopulationDto getPopulation(){
        //return populationClient.getPopulation("{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[1.6314697265625,48.436489955944154],[3.3013916015624996,48.436489955944154],[3.3013916015624996,49.09904896047897],[1.6314697265625,49.09904896047897],[1.6314697265625,48.436489955944154]]]}}]}");
        return populationClient.getPopulation(geoJsonCreator.getGeoJSON());
    }
}
