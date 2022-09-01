package patternMatching.instanceofExample.after;

import patternMatching.instanceofExample.before.Shape;

public class Circle implements Shape {
    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double radius() {
        return radius;
    }
}
