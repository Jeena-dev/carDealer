package service;

import model.Car;
import repository.CarRepository;

public class CarService {
      // Dependency

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public void addCar(Car car){
        carRepository.addCar(car);
    }

    public Car getCarById(int id){
        return carRepository.getCarById(id);
    }

    public Car[] getAllCars(){
        return carRepository.getAllCars();
    }



}
