package patternMatching.switchcase;

import java.util.*;

//if not sealed then refer switch case comment
interface Shape {
    double area();
}

class Circle implements Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double side1, side2;

    public Rectangle() {
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    @Override public double area() {
        return side1 * side2;
    }
}

public class ShapeImplementation {
    static void classify(Shape s) {
        System.out.println(switch (s) {
            case Circle c -> "Large Circle: " + c;
            case Rectangle r -> "Rectangle: " + r;
            default -> throw new IllegalStateException("Unexpected value: " + s);
        });
    }

    public static void main(String[] args) {
        List.of(
                new Circle(25.0),
                new Rectangle(12.0, 15.0)
        ).forEach(t -> classify(t));
    }
}
