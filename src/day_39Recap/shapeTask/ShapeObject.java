package day_39Recap.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        //Square square = new Square(-10);
        //System.out.println(square); Invalid value: -10.0 ------> Process finished with exit code 1

        Square square = new Square(10);
        System.out.println(square); //Square{side=10.0, area='100.0', perimeter'40.0'}

        //square.side = 20;
        //square.setSide(0); Invalid value: 0.0
        square.setSide(20);
        System.out.println(square.getSide()); //20.0

        System.out.println("_______________________________________");

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle); //Rectangle{length=5.0, width=6.0, area='30.0', perimeter'22.0'}

        System.out.println(rectangle.area()); //30.0
        rectangle.setLength(10);
        System.out.println(rectangle.getLength());//10.0
        System.out.println(rectangle);//Rectangle{length=10.0, width=6.0, area='60.0', perimeter'32.0'}
        System.out.println(rectangle.getName()); //Rectangle

        System.out.println("_______________________________________");

        //Circle circle = new Circle(-10);
        //System.out.println(circle); Invalid value: -10.0 ------> Process finished with exit code 1

        Circle circle = new Circle(7.5);
        System.out.println(circle); //Circle{radius=7.5, pi='3.14', area='176.625', perimeter'47.1'}

        circle.setRadius(15.5);
        System.out.println(circle.getRadius());//15.5
        System.out.println(circle);//Circle{radius=15.5, pi='3.14', area='754.385', perimeter'97.34'}
    }
}
