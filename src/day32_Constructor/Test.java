package day32_Constructor;

public class Test {

    public Test(){
        System.out.println("A");
    }

    public Test(int a){
        this();
        System.out.println("B");
    }

    public Test(double a){
        this(1);
        System.out.println("C");
    }

    public Test(String str){
        this(2.2);
        System.out.println("D");
    }

    public static void main(String[] args) {

        new Test("Java"); // A, B, C, D
        new Test(1.5); // A, B, C
        new Test(2); // A, B
        new Test(); // A
    }
}
