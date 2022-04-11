package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone12", "6.7 inches", 1000, "Black" );
        System.out.println(iphone);

        Samsung samsung = new Samsung("Galaxy S19", "6 inches", 900, "White");
        System.out.println(samsung);

        Nokia nokia = new Nokia("Brick", "4", 50, "Gray");
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime("yahoo@gmail.com");
        iphone.faceTime(1234566789);

        samsung.call(911); //SamsungGalaxy S19 is calling 911
        samsung.text(123456789); //SamsungGalaxy S19 is texting 123456789
        samsung.freeze(); //SamsungGalaxy S19 is freezing

        nokia.call(911); //NokiaBrick is calling 911
        nokia.text(123456789); //NokiaBrick is texting 123456789
        nokia.selfDefense(); //You can use NokiaBrick as self defense tool

        Phone.hasBattery = false;
        System.out.println(Iphone.hasBattery);//false
        Iphone.hasBattery = true;
        System.out.println(Samsung.hasBattery);//true
    }
}
