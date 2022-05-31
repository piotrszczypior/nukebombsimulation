package com.example.nukebombsimulation.service;
import com.example.nukebombsimulation.dto.CreateBombDto;
import com.example.nukebombsimulation.geojson.GeoJsonCreator;
import com.example.nukebombsimulation.interfaces.IBombService;
import com.example.nukebombsimulation.model.Result;
import com.example.nukebombsimulation.model.ResultBuilder;
import com.example.nukebombsimulation.properties.ApplicationProperties;
import com.example.nukebombsimulation.webclient.client.PopulationClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BombService implements IBombService {
    private static List<Result> results = new ArrayList<>();


    private final PopulationClient populationClient;
    private final GeoJsonCreator geoJsonCreator;

    @Override
    public List<Result> getOutcome(){
//        return ResultBuilder.SetResult(populationClient.getPopulation(geoJsonCreator.getGeoJSON()), geoJsonCreator.getMainRaius());
        return results;
    }


    @Override
    public Result createBomb(CreateBombDto createdBomb) {
        ApplicationProperties properties = new ApplicationProperties(
                createdBomb.getLatitude(),
                createdBomb.getLongitude(),
                createdBomb.getYield(),
                createdBomb.isAirBurst());
        GeoJsonCreator geoJsonCreator = new GeoJsonCreator(properties);
        var result = ResultBuilder.SetResult(populationClient.getPopulation(geoJsonCreator.getGeoJSON()), geoJsonCreator.getMainRaius());
        results.add(result);
        return result;
    }
}
