package com.example.nukebombsimulation.geojson;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.ugeojson.math.draw.CircularDrawingAlgorithmImpl;
import org.ugeojson.model.PositionDto;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCutterTest {


    @Test
    public void optimizeTest()
    {
        //given
        CircularDrawingAlgorithmImpl circleDrawer = new CircularDrawingAlgorithmImpl();
        List<PositionDto> list = circleDrawer.getCirclePositions(
                new PositionDto(50.10 , 10.10), 500);

        //when
        ListCutter listCutter = new ListCutter(list);
        var result = listCutter.optimize();

        //then
        assertEquals(121, result.size());
    }
}