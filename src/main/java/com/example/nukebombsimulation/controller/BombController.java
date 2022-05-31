package com.example.nukebombsimulation.controller;


import com.example.nukebombsimulation.dto.CreateBombDto;
import com.example.nukebombsimulation.interfaces.IBombService;
import com.example.nukebombsimulation.model.Result;
import com.example.nukebombsimulation.service.BombService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@EnableSwagger2
public class BombController {

    private final IBombService _bombService;

    @GetMapping("")
    public List<Result> getResult(){
        return _bombService.getOutcome();
    }

    @PostMapping("/")
    public Result createBomb(@RequestBody CreateBombDto createdBomb)
    {
        return _bombService.createBomb(createdBomb);
    }

}
