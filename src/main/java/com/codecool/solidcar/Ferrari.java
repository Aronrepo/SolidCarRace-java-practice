package com.codecool.solidcar;

public class Ferrari extends Car {
    private static final int FUEL_CONSUMPTION_PER_LAP = 2;


    @Override
    public void consumeFuelPerLap() {
        increaseConsumedFuel(FUEL_CONSUMPTION_PER_LAP);
    }
}
