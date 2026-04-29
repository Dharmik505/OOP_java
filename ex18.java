abstract class AbstractVehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class CarSub extends AbstractVehicle {
    String fuelType() {
        return "Petrol/Diesel";
    }
    int noOfWheels() {
        return 4;
    }
}

class BikeSub extends AbstractVehicle {
    String fuelType() {
        return "Petrol";
    }
    int noOfWheels() {
        return 2;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        CarSub c = new CarSub();
        System.out.println(c.fuelType());
        System.out.println(c.noOfWheels());

        BikeSub b = new BikeSub();
        System.out.println(b.fuelType());
        System.out.println(b.noOfWheels());
    }
}
