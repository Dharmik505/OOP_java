import java.util.Scanner;

class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    public Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println(vehicleNumber + " " + brand + " " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    public Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(numberOfSeats + " " + ACavailable);
    }
}

class ElectricCar extends Car {
    protected int batteryCapacity;
    protected int chargingTime;

    public ElectricCar(String vNum, String b, String fType, int seats, boolean ac, int bat, int time) {
        super(vNum, b, fType, seats, ac);
        this.batteryCapacity = bat;
        this.chargingTime = time;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(batteryCapacity + " " + chargingTime);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricCar ec = new ElectricCar(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean(), sc.nextInt(), sc.nextInt());
        ec.displayDetails();
        
        Vehicle v = new Car("MH12", "Tata", "Petrol", 5, true);
        if (v instanceof Car) {
            Car c = (Car) v;
            c.displayDetails();
        }
        sc.close();
    }
}
