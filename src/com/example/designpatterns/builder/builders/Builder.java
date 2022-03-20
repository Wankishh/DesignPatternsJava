package com.example.designpatterns.builder.builders;

import com.example.designpatterns.builder.car.CarType;
import com.example.designpatterns.builder.components.Engine;
import com.example.designpatterns.builder.components.GPSNavigator;
import com.example.designpatterns.builder.components.Transmission;
import com.example.designpatterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
