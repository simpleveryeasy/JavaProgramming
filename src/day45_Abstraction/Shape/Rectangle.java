package day45_Abstraction.Shape;

public class Rectangle extends Shape{

    private double longSide;
    private double shortSide;

    public Rectangle(String name) {
        super("Rectangle");
        setLongSide(longSide);
        setShortSide(shortSide);
    }

    public void setLongSide(double longSide) {
        this.longSide = longSide;
    }

    public void setShortSide(double shortSide) {
        this.shortSide = shortSide;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
