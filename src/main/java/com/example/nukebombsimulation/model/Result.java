package com.example.nukebombsimulation.model;

import lombok.Builder;

@Builder
public class Result {
    private CasualtiesDto casualties;
    private EfectsRadiusesDto radiuses;

    public Result(CasualtiesDto casualties, EfectsRadiusesDto radiuses) {
        this.casualties = casualties;
        this.radiuses = radiuses;
    }

    public void setCasualties(CasualtiesDto casualties) {
        this.casualties = casualties;
    }

    public void setRadiuses(EfectsRadiusesDto radiuses) {
        this.radiuses = radiuses;
    }

    public CasualtiesDto getCasualties() {
        return casualties;
    }

    public EfectsRadiusesDto getRadiuses() {
        return radiuses;
    }
}
