package com.directi.training.srp.work;

import java.util.List;

public class CarFormatter {
    public String getCarsNames(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand()).append(" ").append(car.getModel()).append(", ");
        }
        return sb.substring(0, sb.length() - 2);  // Remove the last comma and space
    }
}
