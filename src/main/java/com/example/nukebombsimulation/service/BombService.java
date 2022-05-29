package com.example.nukebombsimulation.service;
import com.example.nukebombsimulation.geojson.GeoJsonCreator;
import com.example.nukebombsimulation.model.PopulationDto;
import com.example.nukebombsimulation.model.Result;
import com.example.nukebombsimulation.model.ResultBuilder;
import com.example.nukebombsimulation.webclient.client.PopulationClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BombService {

    private final PopulationClient populationClient;
    private final GeoJsonCreator geoJsonCreator;


    public Result getOutcome(){
        return ResultBuilder.SetResult(populationClient.getPopulation(geoJsonCreator.getGeoJSON()));
    }
}
