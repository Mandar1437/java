// Base class
class Vehicle {
    String brand = "Generic Vehicle";

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Derived class (Single Inheritance)
class Car extends Vehicle {
    String model = "Sedan";

    void displayModel() {
        System.out.println("Model: " + model);
    }
}

// Further derived class (Multilevel Inheritance)
class ElectricCar extends Car {
    int batteryCapacity = 75; // in kWh

    void displayBatteryCapacity() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar();
        myTesla.brand = "Tesla"; 
        myTesla.displayBrand();
        myTesla.displayModel();
        myTesla.displayBatteryCapacity();
    }
}

