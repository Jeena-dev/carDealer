package model;

public class Car {
    private int id;
        private String model;
        private String make;
        private int year;
        private int numberOfDoors;
        private double mileage;
        private double currentSpeed;
        private boolean isMoving;

        public Car(int id ,String model, String make, int year, int numberOfDoors, double mileage, double currentSpeed, boolean isMoving) {
            this.id = id;
            this.model = model;
            this.make = make;
            this.year = year;
            this.numberOfDoors = numberOfDoors;
            this.mileage = mileage;
            this.currentSpeed = currentSpeed;
            this.isMoving = isMoving;
        }

        public int getId(){
            return id;
        }

        public void setId(int id){
            this.id = id;
        }
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }

        public void setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
        }

        public double getMileage() {
            return mileage;
        }

        public void setMileage(double mileage) {
            this.mileage = mileage;
        }

        public double getCurrentSpeed() {
            return currentSpeed;
        }

        public void setCurrentSpeed(double currentSpeed) {
            this.currentSpeed = currentSpeed;
        }

        public boolean isMoving() {
            return isMoving;
        }

        public void setMoving(boolean moving) {
            isMoving = moving;
        }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", numberOfDoors=" + numberOfDoors +
                ", mileage=" + mileage +
                ", currentSpeed=" + currentSpeed +
                ", isMoving=" + isMoving +
                '}';
    }
}


