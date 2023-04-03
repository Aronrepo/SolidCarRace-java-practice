package com.codecool.solidcar;

import java.util.List;
import java.util.ArrayList;

public class Race {
    private int numberOfLaps;
    private List<Car> cars;

    public Race(int numberOfLaps, List<Car> cars) {
        this.numberOfLaps = numberOfLaps;
        this.cars = cars;
    }

    public int calculateFuel(){
        int fuel = 0;
        for(Car car: cars) {
            if(car instanceof Ford) {
                fuel += 4;
            }

            if(car instanceof Ferrari) {
                fuel += 2;
            }
        }
        return numberOfLaps * fuel;
    };

}

