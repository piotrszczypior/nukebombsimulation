package com.example.nukebombsimulation.controller;


import com.example.nukebombsimulation.model.PopulationDto;
import com.example.nukebombsimulation.service.BombService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BombController {

    private final BombService bombService;

    @GetMapping
    public PopulationDto getBomb() {
        return bombService.getPopulation();
    }


}
