package com.directi.training.srp.work;

public class CarManager {
    private CarDatabase _carDatabase = new CarDatabase();
    private CarFormatter _carFormatter = new CarFormatter();
    private CarSelector _carSelector = new CarSelector();

    public Car getCarById(String carId) {
        return _carDatabase.getCarById(carId);
    }

    public String getCarsNames() {
        return _carFormatter.getCarsNames(_carDatabase.getAllCars());
    }

    public Car getBestCar() {
        return _carSelector.getBestCar(_carDatabase.getAllCars());
    }
}
