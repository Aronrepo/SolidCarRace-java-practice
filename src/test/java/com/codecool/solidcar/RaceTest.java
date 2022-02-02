package com.codecool.solidcar;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

    @Test
    void test_calculateFuel_worksForFerrariOneLap() {
        List<Car> ferraries = new ArrayList<Car>(){{
            add(new Ferrari());
            add(new Ferrari());
        }};
        Race race = new Race(1, ferraries);
        assertEquals(4, race.calculateFuel());
    }

    @Test
    void test_calculateFuel_worksForBothOneLap() {
        List<Car> cars = new ArrayList<Car>(){{
            add(new Ferrari());
            add(new Ferrari());
            add(new Ford());
            add(new Ford());
        }};
        Race race = new Race(1, cars);
        assertEquals(12, race.calculateFuel());
    }

    @Test
    void test_calculateFuel_worksForFordThreeLap() {
        List<Car> fords = new ArrayList<Car>(){{
            add(new Ford());
            add(new Ford());
        }};
        Race race = new Race(3, fords);
        assertEquals(24, race.calculateFuel());
    }

    @Test
    void test_calculateFuel_worksForFerrariThreeLap() {
        List<Car> ferraries = new ArrayList<Car>(){{
            add(new Ferrari());
            add(new Ferrari());
        }};
        Race race = new Race(3, ferraries);
        assertEquals(12, race.calculateFuel());
    }

    @Test
    void test_calculateFuel_worksForBothThreeLap() {
        List<Car> cars = new ArrayList<Car>(){{
            add(new Ferrari());
            add(new Ferrari());
            add(new Ford());
            add(new Ford());
        }};
        Race race = new Race(3, cars);
        assertEquals(36, race.calculateFuel());
    }

    @Test
    void test_calculateFuel_worksForBothZeroLap() {
        List<Car> cars = new ArrayList<Car>(){{
            add(new Ferrari());
            add(new Ferrari());
            add(new Ford());
            add(new Ford());
        }};
        Race race = new Race(0, cars);
        assertEquals(0, race.calculateFuel());
    }

    @Test
    void test_calculateFuel_worksForNull() {
        List<Car> cars = null;
        Race race = new Race(1, cars);
        assertEquals(0, race.calculateFuel());
    }
}