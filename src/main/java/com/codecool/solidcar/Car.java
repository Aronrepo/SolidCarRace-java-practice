package com.codecool.solidcar;

public abstract class Car {


    private int consumptedFuel = 0;

    protected void increaseConsumedFuel(int fuelConsumption) {
        consumptedFuel += fuelConsumption;
    }

    public abstract void consumeFuelPerLap();


    public int getConsumptedFuel() {
        return consumptedFuel;
    }
}
