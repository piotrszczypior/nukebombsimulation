package com.example.nukebombsimulation.geojson;

import com.example.nukebombsimulation.calculations.MainRadiusCalculator;
import com.example.nukebombsimulation.model.Bomb;
import org.ugeojson.builder.UltimateGeoJSONBuilder;
import org.ugeojson.math.draw.CircularDrawingAlgorithmImpl;
import org.ugeojson.model.PositionDto;
import org.ugeojson.model.factory.UltimateGeoJSONFactory;
import org.ugeojson.model.geometry.PolygonDto;

import java.util.List;

public class GeoJsonCreator {

    private final Bomb bomb;
    private final MainRadiusCalculator mainRadiusCalculator;

    public GeoJsonCreator(Bomb bomb) {
        this.bomb = bomb;
        this.mainRadiusCalculator = new MainRadiusCalculator(bomb.isAirBurst(), bomb.getYield());
    }

    public String getGeoJSON() {
        CircularDrawingAlgorithmImpl circleDrawer = new CircularDrawingAlgorithmImpl();
        UltimateGeoJSONFactory factory = new UltimateGeoJSONFactory();
        List<PositionDto> circlePoints = circleDrawer.getCirclePositions(new PositionDto(bomb.getLongitude(), bomb.getLatitude()), mainRadiusCalculator.calculateRadius());
        ListCutter listCutter = new ListCutter(circlePoints);
        PolygonDto circleAsPolygon = factory.createPolygon(listCutter.optimize());
        return UltimateGeoJSONBuilder.getInstance().toGeoJSON(circleAsPolygon).strip();
    }
}
