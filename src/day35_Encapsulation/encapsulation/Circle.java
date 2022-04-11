package day35_Encapsulation.encapsulation;

public class Circle {

    private int radius;
    public static double pi;

    public Circle(int radius) {
        setRadius(radius);
    }

    static {
        pi = 3.14;
    }

    public void setRadius(int radius){
        if (radius <= 0){
            System.err.println("Invalid entry: " + radius);
            return;
        }
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public double calcArea(int radius){
        double area = radius * radius * pi;
        return area;
    }

    public double calcPerimeter(int radius){
        double perimeter = 2 * radius * pi;
        return perimeter;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea(radius) +
                "perimeter=" + calcPerimeter(radius) +
                '}';
    }
}
/*
2. Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()


 */
