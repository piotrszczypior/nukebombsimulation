package com.example.nukebombsimulation.geojson;

import com.example.nukebombsimulation.properties.ApplicationProperties;
import com.typesafe.config.ConfigFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.ugeojson.builder.UltimateGeoJSONBuilder;
import org.ugeojson.math.draw.CircularDrawingAlgorithmImpl;
import org.ugeojson.model.PositionDto;
import org.ugeojson.model.factory.UltimateGeoJSONFactory;
import org.ugeojson.model.geometry.PolygonDto;

import java.util.List;
@Component
public class GeoJsonCreator {

    private ApplicationProperties applicationProperties;

    public GeoJsonCreator() {
        this.applicationProperties = new ApplicationProperties(ConfigFactory.load());;
    }

    CircularDrawingAlgorithmImpl circleDrawer = new CircularDrawingAlgorithmImpl();
    UltimateGeoJSONFactory factory = new UltimateGeoJSONFactory();


    public String getGeoJSON() {
        List<PositionDto> circlePoints = circleDrawer.getCirclePositions(new PositionDto(applicationProperties.getLongitude(),
                applicationProperties.getLatitude()), 5000.0);
        ListCutter listCutter = new ListCutter(circlePoints);
        PolygonDto circleAsPolygon = factory.createPolygon(listCutter.optimize());
        return UltimateGeoJSONBuilder.getInstance().toGeoJSON(circleAsPolygon).strip();
    }
}
