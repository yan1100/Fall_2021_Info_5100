package com.company;

public class TrafficLight {
    private final Green green;

    public TrafficLight() {
        green = new Green();
    }

    public void carArrived(int carId, int roadId, int direction, Runnable turnGreen, Runnable crossCar
    ) {
        synchronized (green) {
            if (green.road != roadId) {
                turnGreen.run();
                green.road = roadId;
            }
            crossCar.run();
        }

    }

    private class Green {
        int road = 1;
    }
}
