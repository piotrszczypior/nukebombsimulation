package com.example.nukebombsimulation.webclient.client;

import com.example.nukebombsimulation.model.PopulationDto;
import com.example.nukebombsimulation.webclient.dto.MainDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PopulationClient {

    public RestTemplate restTemplate = new RestTemplate();

    public float getPopulation(String geojson){
        MainDto mainDto = restTemplate.getForObject(
                "https://api.worldpop.org/v1/services/stats?dataset=wpgppop&year=2010&geojson={geojson}&runasync=false", MainDto.class,geojson);
        return mainDto.getData().getTotal_population();
    }
}
