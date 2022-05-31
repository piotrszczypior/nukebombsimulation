package com.example.nukebombsimulation.geojson;

import com.example.nukebombsimulation.calculations.MainRadiusCalculator;
import com.example.nukebombsimulation.properties.ApplicationProperties;
import org.springframework.stereotype.Component;
import org.ugeojson.builder.UltimateGeoJSONBuilder;
import org.ugeojson.math.draw.CircularDrawingAlgorithmImpl;
import org.ugeojson.model.PositionDto;
import org.ugeojson.model.factory.UltimateGeoJSONFactory;
import org.ugeojson.model.geometry.PolygonDto;

import java.util.List;
@Component
public class GeoJsonCreator {

    private final ApplicationProperties applicationProperties;
    private final MainRadiusCalculator mainRadiusCalculator;

    public GeoJsonCreator(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
        this.mainRadiusCalculator = new MainRadiusCalculator(applicationProperties.isAirburst(), applicationProperties.getYield());
    }

    public double getMainRaius()
    {
        return mainRadiusCalculator.calculateRadius();
    }


    public String getGeoJSON() {
        CircularDrawingAlgorithmImpl circleDrawer = new CircularDrawingAlgorithmImpl();
        UltimateGeoJSONFactory factory = new UltimateGeoJSONFactory();
        List<PositionDto> circlePoints = circleDrawer.getCirclePositions(new PositionDto(applicationProperties.getLongitude(), applicationProperties.getLatitude()), mainRadiusCalculator.calculateRadius());
        ListCutter listCutter = new ListCutter(circlePoints);
        PolygonDto circleAsPolygon = factory.createPolygon(listCutter.optimize());
        return UltimateGeoJSONBuilder.getInstance().toGeoJSON(circleAsPolygon).strip();
    }
}
