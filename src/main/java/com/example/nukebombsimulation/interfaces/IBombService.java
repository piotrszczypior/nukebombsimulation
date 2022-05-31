package com.example.nukebombsimulation.interfaces;

import com.example.nukebombsimulation.dto.CreateBombDto;
import com.example.nukebombsimulation.model.Result;

import java.util.List;

public interface IBombService {

    List<Result> getOutcome();

    Result createBomb(CreateBombDto createdBomb);
}
