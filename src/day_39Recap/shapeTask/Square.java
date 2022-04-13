package day_39Recap.shapeTask;

public class Square extends Shape{

    //instance variable that can not be inherited from parent class shape
    private double side;

    //getter for variable side
    public double getSide() {
        return side;
    }

    //setter for variable side
    public void setSide(double side) {
        if (side <= 0){
            System.err.println("Invalid value: " + side);
            System.exit(1);
        }
        this.side = side;
    }

    // Construction call from parent class
    public Square(double side) {
        super("Square");
        setSide(side);
    }

    //area method overriding
    @Override
    public double area() {
        return side * side;
    }

    //perimeter method overriding
    @Override
    public double perimeter() {
        return side * 4;
    }

    //toString method overriding
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter'" + perimeter() + '\'' +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter

 */