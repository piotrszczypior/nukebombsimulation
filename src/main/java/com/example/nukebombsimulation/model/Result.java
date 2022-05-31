package com.example.nukebombsimulation.model;

import com.example.nukebombsimulation.dto.CasualtiesDto;
import com.example.nukebombsimulation.dto.EffectsRadiusesDto;
import lombok.Builder;

@Builder
public class Result {
    private CasualtiesDto casualties;
    private EffectsRadiusesDto radiuses;

    public Result(CasualtiesDto casualties, EffectsRadiusesDto radiuses) {
        this.casualties = casualties;
        this.radiuses = radiuses;
    }

    public void setCasualties(CasualtiesDto casualties) {
        this.casualties = casualties;
    }

    public void setRadiuses(EffectsRadiusesDto radiuses) {
        this.radiuses = radiuses;
    }

    public CasualtiesDto getCasualties() {
        return casualties;
    }

    public EffectsRadiusesDto getRadiuses() {
        return radiuses;
    }
}
