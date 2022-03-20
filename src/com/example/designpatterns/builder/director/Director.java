package com.example.designpatterns.builder.director;

import com.example.designpatterns.builder.builders.Builder;
import com.example.designpatterns.builder.car.CarType;
import com.example.designpatterns.builder.components.Engine;
import com.example.designpatterns.builder.components.GPSNavigator;
import com.example.designpatterns.builder.components.Transmission;
import com.example.designpatterns.builder.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
