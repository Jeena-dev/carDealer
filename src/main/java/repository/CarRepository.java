package repository;

import exception.CarNotFoundException;
import model.Car;

public interface CarRepository {

    void addCar(Car car);
    Car getCarById(int id) throws CarNotFoundException;
    Car[] getAllCars();
}

