package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static { // runs first and only one time, runs even before main method
        System.out.println("Static Block");
    }
}
