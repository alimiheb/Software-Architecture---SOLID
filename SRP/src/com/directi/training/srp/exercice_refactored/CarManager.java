package com.directi.training.srp.exercice_refactored;

import com.directi.training.srp.exercise.Car;

public class CarManager
{
    private CarDB carDB;
    private CarFormat carFormat;
    private CarSelector carSelector;

    public CarManager()
    {
        this.carDB = new CarDB();
        this.carFormat = new CarFormat();
        this.carSelector = new CarSelector();
    }

    // Délègue la responsabilité d'accès aux données à CarDB
    public Car getFromDb(final String carId)
    {
        return carDB.getFromDb(carId);
    }

    // Délègue la responsabilité de formatage à CarFormat
    public String getCarsNames()
    {
        return carFormat.getCarsNames(carDB.getAllCars());
    }

    // Délègue la responsabilité de sélection à CarSelector
    public Car getBestCar()
    {
        return carSelector.getBestCar(carDB.getAllCars());
    }
}