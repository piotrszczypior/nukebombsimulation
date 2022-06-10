package com.example.nukebombsimulation.service;
import com.example.nukebombsimulation.dto.CreateBombDto;
import com.example.nukebombsimulation.geojson.GeoJsonCreator;
import com.example.nukebombsimulation.model.Bomb;
import com.example.nukebombsimulation.model.Result;
import com.example.nukebombsimulation.builder.ResultBuilder;
import com.example.nukebombsimulation.properties.ApplicationProperties;
import com.example.nukebombsimulation.webclient.client.PopulationClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BombService implements IBombService {
    private static final List<Result> _RESULTS = new ArrayList<>();

    private final PopulationClient populationClient;

    @Override
    public List<Result> getOutcome(){
        return _RESULTS;
    }

    @Override
    public Result createBomb(CreateBombDto createdBomb) {
        int id = _RESULTS.size() > 0 ? _RESULTS.size() : 0;
        Bomb newBomb = new Bomb(
                id,
                createdBomb.getLatitude(),
                createdBomb.getLongitude(),
                createdBomb.getYield(),
                createdBomb.isAirBurst()
        );

        Result result = new ResultBuilder(populationClient).SetResult(newBomb);
        _RESULTS.add(result);
        return result;
    }
}
