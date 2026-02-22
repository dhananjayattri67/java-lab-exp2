class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(double side) { // Overloading constructor for square
        this.length = side;
        this.breadth = side;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeSystem {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.calculateArea());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + r.calculateArea());

        Rectangle square = new Rectangle(5);
        System.out.println("Square Area: " + square.calculateArea());

        Triangle t = new Triangle(4, 5);
        System.out.println("Triangle Area: " + t.calculateArea());
    }
}
