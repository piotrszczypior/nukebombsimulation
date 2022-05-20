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


//    public BombService(PopulationClient populationClient, GeoJsonCreator geoJsonCreator) {
//        this.populationClient = populationClient;
//        this.geoJsonCreator = geoJsonCreator;
//    }

    public PopulationDto getPopulation(){
        System.out.println(geoJsonCreator.getGeoJSON());
        //return populationClient.getPopulation("{\"type\":\"FeatureCollection\",\"features\":[{\"type\":\"Feature\",\"properties\":{},\"geometry\":{\"type\":\"Polygon\",\"coordinates\":[[[1.6314697265625,48.436489955944154],[3.3013916015624996,48.436489955944154],[3.3013916015624996,49.09904896047897],[1.6314697265625,49.09904896047897],[1.6314697265625,48.436489955944154]]]}}]}");
        return populationClient.getPopulation(geoJsonCreator.getGeoJSON());
    }
}
