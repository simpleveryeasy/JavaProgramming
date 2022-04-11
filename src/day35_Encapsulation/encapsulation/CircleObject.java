package day35_Encapsulation.encapsulation;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(6);


        System.out.println(circle1.getRadius()); //6
        double area = circle1.calcArea(circle1.getRadius());
        double perimeter = circle1.calcPerimeter(circle1.getRadius());
        System.out.println(area); // //113.04
        System.out.println(perimeter); //37.68

        System.out.println(circle1); //Circle{radius=6area=113.04perimeter=37.68}
    }
}
