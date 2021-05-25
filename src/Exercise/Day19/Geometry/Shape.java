package Exercise.Day19.Geometry;

public abstract class Shape {
    protected double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public Shape() {
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}
