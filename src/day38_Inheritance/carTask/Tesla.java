package day38_Inheritance.carTask;

public class Tesla extends Car{

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " has auto pilot");
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " is starting by saying \"Start\"");
    }
}
/*
3. Tesla:
					extra methods:
						autoPilot();
 */
