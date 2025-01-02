class Rectangle {
    int length;
    int width;

    int calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 10;
        rect.width = 5;

        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}
