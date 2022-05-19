package com.example.nukebombsimulation.geojson;

import org.ugeojson.model.PositionDto;

import java.util.List;
import java.util.stream.Collectors;

public class ListCutter {
    private List<PositionDto> points;

    public ListCutter(List<PositionDto> points) {
        this.points = points;
    }

    public List<PositionDto> optimize()
    {
        return points.stream().filter(x -> points.indexOf(x)%3 == 0).collect(Collectors.toList());
    }



}
