package com.codecool.solidcar;

public class Ford extends Car {
    private static final int FUEL_CONSUMPTION_PER_LAP = 4;


    @Override
    public void consumeFuelPerLap() {
        increaseConsumedFuel(FUEL_CONSUMPTION_PER_LAP);
    }
}
