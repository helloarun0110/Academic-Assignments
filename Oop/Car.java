
//practice problem 05

public class Car {
    String owner;
    String brand;
    String serialNumber;
    boolean isRunning;
    double fuelLevel;

    Car(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }

    void start() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car started");
        } else {
            System.out.println("Cannot start. Fuel empty");
        }
    }

    void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Car stopped");
        } else {
            System.out.println("Car is already stopped");
        }
    }

    void checkFuel() {
        System.out.println("Fuel level: " + fuelLevel + " liters");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Arun", "Toyota", "SN2025X", 10.5);

        myCar.checkFuel();
        myCar.start();
        myCar.stop();
    }
}
