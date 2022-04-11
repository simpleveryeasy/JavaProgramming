package week11;

public class LocalVsInstance {

    public int a = 4;

    public void showDifference(){    // Ques= I want to be able to change this a as well
        int a = 5;  // this a is local to the method
        System.out.println(a);
    }

    public static void main(String[] args) {

        LocalVsInstance obj = new LocalVsInstance();
        System.out.println("--coming from the method---");
        obj.showDifference();


        System.out.println("--coming from instance variable----");
        System.out.println(obj.a);
        obj.a = 1;
        System.out.println(obj.a);
    }

}
