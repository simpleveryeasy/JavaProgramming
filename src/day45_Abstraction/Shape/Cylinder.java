package day45_Abstraction.Shape;

public class Cylinder extends Shape implements Volume{


    private double radius, height;

    public final static double pi = 3.14;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new RuntimeException("invalid radius " + radius);
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0){
            throw new RuntimeException("invalid radius " + height);
        }
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * pi * radius * height;
    }

    @Override
    public double perimeter() {
        return (2 * pi * radius * height) + (2 * pi * radius * radius);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public double volume() {
        return pi * radius * radius * height;
    }
}
