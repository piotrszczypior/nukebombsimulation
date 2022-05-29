package com.example.nukebombsimulation.controller;


import com.example.nukebombsimulation.model.Result;
import com.example.nukebombsimulation.service.BombService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BombController {

    private final BombService bombService;

    @GetMapping()
    public Result getResult(){
        return bombService.getOutcome();
    }

}
