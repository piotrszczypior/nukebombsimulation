package com.example.nukebombsimulation.geojson;

import com.example.nukebombsimulation.calculations.AllRadiusesCalculator;
import com.example.nukebombsimulation.calculations.IRadiusCalculator;
import com.example.nukebombsimulation.calculations.MainRadiusCalculator;
import com.example.nukebombsimulation.model.EfectsRadiusesDto;
import com.example.nukebombsimulation.properties.ApplicationProperties;
import com.typesafe.config.ConfigFactory;
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
    private final AllRadiusesCalculator allRadiusesCalculator;

    public GeoJsonCreator() {
        this.applicationProperties = new ApplicationProperties(ConfigFactory.load());
        this.mainRadiusCalculator = new MainRadiusCalculator();
        this.allRadiusesCalculator = new AllRadiusesCalculator(mainRadiusCalculator);
    }


    public String getGeoJSON() {
        CircularDrawingAlgorithmImpl circleDrawer = new CircularDrawingAlgorithmImpl();
        UltimateGeoJSONFactory factory = new UltimateGeoJSONFactory();
        List<PositionDto> circlePoints = circleDrawer.getCirclePositions(new PositionDto(applicationProperties.getLongitude(), applicationProperties.getLatitude()), mainRadiusCalculator.calculateRadius());
        ListCutter listCutter = new ListCutter(circlePoints);
        PolygonDto circleAsPolygon = factory.createPolygon(listCutter.optimize());
//        System.out.println(mainRadiusCalculator.calculateRadius());
        return UltimateGeoJSONBuilder.getInstance().toGeoJSON(circleAsPolygon).strip();
    }
}
