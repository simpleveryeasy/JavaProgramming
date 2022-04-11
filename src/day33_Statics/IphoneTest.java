package day33_Statics;

public class IphoneTest {

    public static void main(String[] args) {

    //  Iphone.printOS(); ---->  Non-static method 'printOS()' cannot be referenced from a static context
        System.out.println(Iphone.OS); //iOS
    //  System.out.println(Iphone.model); -----> Non-static field 'model' cannot be referenced from a static context
        Iphone.printbrandAndmadeIn(); //Apple : China



    }

}
