package com.example.nukebombsimulation.geojson;

import org.ugeojson.builder.UltimateGeoJSONBuilder;
import org.ugeojson.math.draw.CircularDrawingAlgorithmImpl;
import org.ugeojson.model.PositionDto;
import org.ugeojson.model.factory.UltimateGeoJSONFactory;
import org.ugeojson.model.geometry.PolygonDto;

import java.util.List;

public class GeoJsonCreator {
    CircularDrawingAlgorithmImpl circleDrawer = new CircularDrawingAlgorithmImpl();
    UltimateGeoJSONFactory factory = new UltimateGeoJSONFactory();

    public String getGeoJSON() {
        List<PositionDto> circlePoints = circleDrawer.getCirclePositions(new PositionDto(17, 51), 5000.0);
        PolygonDto circleAsPolygon = factory.createPolygon(circlePoints);
        return UltimateGeoJSONBuilder.getInstance().toGeoJSON(circleAsPolygon);
    }
}
