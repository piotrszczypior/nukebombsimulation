package com.example.nukebombsimulation.calculations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainRadiusCalculatorTest {

    @Test
    void calculateRadius() {
        //given
        boolean isAirburst = true;
        int yield = 100;
        int properResult = 7602;

        // when
        MainRadiusCalculator mainRadiusCalculator =
                new MainRadiusCalculator(isAirburst,yield);
        var result = mainRadiusCalculator.calculateRadius();

        //then
        assertEquals(properResult,(int)result );

    }
}