package patternMatching.instanceofExample.before;

public interface Shape {
    public static double getPerimeter(Shape shape) throws IllegalArgumentException {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return 2 * rectangle.length() + 2 * rectangle.width();
        }
        else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return 2 * circle.radius() * Math.PI;
        }
        else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }
}
