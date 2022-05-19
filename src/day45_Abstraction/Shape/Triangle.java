package day45_Abstraction.Shape;

public class Triangle extends Shape{

    private double base;
    private double height;

    public Triangle(String name) {
        super("Triangle");
        setBase(base);
    }

    public void setHeight(double height) {
        if (height <= 0){
            throw new RuntimeException("invalid height " + height);
        }
        this.height = height;
    }

    public void setBase(double side) {
        if (side <= 0){
            throw new RuntimeException("invalid base " + base);
        }
        this.base = side;
    }

    @Override
    public double area() {
        return base*height/2;
    }

    @Override
    public double perimeter() {
        return 3*base;
    }
}
