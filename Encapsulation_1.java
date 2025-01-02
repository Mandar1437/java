
class Vehicle {
    private String type;  

    public String getType() { 
        return type;
    }

    public void setType(String type) { 
        this.type = type;
    }

    
    public void displayInfo() {
        System.out.println("This is a vehicle of type: " + type);
    }
}


class Car extends Vehicle {
    @Override
    public void displayInfo() {
        System.out.println("This is a car, which is a type of vehicle.");
    }
}

public class Encapsulation_1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setType("General"); // Using setter to set the value
        vehicle.displayInfo(); // Calls Vehicle's method

        Vehicle car = new Car(); // Polymorphism: Car object referred by Vehicle
        car.setType("Car");
        car.displayInfo(); // Calls overridden method in Car
    }
}
