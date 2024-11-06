package com.directi.training.isp.work;

import java.util.Random;

public class Sensor {
    public void register(IProximitySensor sensor) {
        while (true) {
            if (isPersonClose()) {
                sensor.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}
