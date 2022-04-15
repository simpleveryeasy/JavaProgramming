package day37_Inheritance.phoneTask;

public final class Iphone extends Phone{

    public Iphone(String model, String size, double price, String color){
        super("Apple", model, size, price, color);
    }

    public final void faceTime(long phoneNumber){
        System.out.println(brand + model + " is faceTiming " + phoneNumber );
    }
    public void faceTime(String email){
        System.out.println(brand + model + " is faceTiming " + email );
    }
}
/*
Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

 */
