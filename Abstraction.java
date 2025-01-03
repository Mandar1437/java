// Abstract class
abstract class Shape {
    abstract void calculateArea(); // Abstract method
    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Concrete class implementing abstract methods
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Concrete class implementing abstract methods
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle(7); // Upcasting
        circle.displayInfo();
        circle.calculateArea();

        Shape rectangle = new Rectangle(10, 5); // Upcasting
        rectangle.displayInfo();
        rectangle.calculateArea();
    }
}
