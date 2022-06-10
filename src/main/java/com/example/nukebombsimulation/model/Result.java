package com.example.nukebombsimulation.model;

import com.example.nukebombsimulation.dto.CasualtiesDto;
import com.example.nukebombsimulation.dto.EffectsRadiusesDto;
import lombok.Value;

@Value
public class Result {
    CasualtiesDto casualties;
    EffectsRadiusesDto radiuses;
    Bomb bomb;

    public Result(CasualtiesDto casualties, EffectsRadiusesDto radiuses, Bomb bomb) {
        this.casualties = casualties;
        this.radiuses = radiuses;
        this.bomb = bomb;
    }

    public CasualtiesDto getCasualties() {
        return casualties;
    }

    public EffectsRadiusesDto getRadiuses() {
        return radiuses;
    }

    public Bomb getBomb() {
        return bomb;
    }

}
