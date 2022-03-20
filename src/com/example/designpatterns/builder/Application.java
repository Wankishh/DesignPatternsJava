package com.example.designpatterns.builder;

import com.example.designpatterns.builder.builders.CarBuilder;
import com.example.designpatterns.builder.car.Car;
import com.example.designpatterns.builder.director.Director;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        System.out.println("Car route:\n" + car.getGpsNavigator().getRoute());
    }
}
