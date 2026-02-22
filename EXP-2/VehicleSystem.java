class Vehicle {
    int speed;
    int fuel;

    Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    // Overloading
    void accelerate() {
        speed += 10;
    }

    void accelerate(int gear) {
        speed += gear * 5;
    }

    double calculateMileage() {
        return 0;
    }
}

class Car extends Vehicle {
    Car(int speed, int fuel) {
        super(speed, fuel);
    }

    double calculateMileage() {
        return 15.0;
    }
}

class Bike extends Vehicle {
    Bike(int speed, int fuel) {
        super(speed, fuel);
    }

    double calculateMileage() {
        return 40.0;
    }
}

class Truck extends Vehicle {
    Truck(int speed, int fuel) {
        super(speed, fuel);
    }

    double calculateMileage() {
        return 8.0;
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car(60, 20);
        car.accelerate(2);
        System.out.println("Car Mileage: " + car.calculateMileage());

        Bike bike = new Bike(40, 10);
        bike.accelerate();
        System.out.println("Bike Mileage: " + bike.calculateMileage());

        Truck truck = new Truck(50, 30);
        System.out.println("Truck Mileage: " + truck.calculateMileage());
    }
}
