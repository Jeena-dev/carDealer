package impl;

import exception.CarNotFoundException;
import model.Car;
import repository.CarRepository;

public class CarRepositoryImpl implements CarRepository {
    private static final int MAX_CARS = 100;
    Car[] cars = new Car[MAX_CARS];
    private int carCount = 0;
    @Override
    public void addCar(Car car) {
if(carCount<MAX_CARS){
    cars[carCount]= car;
    carCount++;
    System.out.println("Car "+car.getMake()+" added effectively");
}else {
    throw new ArrayIndexOutOfBoundsException("Car storage is full "+MAX_CARS);
}
    }

    @Override
    public Car getCarById(int id) throws CarNotFoundException {
        for(int i = 0;i<carCount;i++){
            if(cars[i].getId()==id){
                return cars[i];
            }
        }
        throw new CarNotFoundException("Car not found with id "+id);
    }

    @Override
    public Car[] getAllCars() {
        Car[] existingCars = new Car[carCount];
        System.arraycopy(cars,0,existingCars,0,carCount);
        return existingCars;
    }
}
