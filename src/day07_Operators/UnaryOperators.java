package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25; // + operator optional
        int num2 = -25; // - operator compulsory
        System.out.println(num1 < 0); // false
        System.out.println(num2 < 0); //true

        System.out.println("_________________________________");

        int a = 5;
        ++a; // pre increment: increases the value by 1 right away
        System.out.println(a);

        --a; // pre decrement: decrease the value by 1 right away
        System.out.println(a);

        System.out.println("__________________________________");

        int b = 100;
        System.out.println(++b); // 101 pre increment: increases the value by 1 right away

        System.out.println("_____________________________________");

        int c = 100;
        System.out.println(c++); // 100 post increment: increases the value by 1 at the next step
        System.out.println(c); // 101 post incremented

        System.out.println("______________________________________");

        int x = 200;
        System.out.println(--x); // 199 pre decrement: decrease the value by 1 right away

        System.out.println("____________________________________");

        int y = 200;
        System.out.println(y--); // 200 post decrement: decrease the value by 1 at the next step
        System.out.println(y); // 199 post decremented

        System.out.println("_____________________________________________________");

        int z = 45;

        System.out.println(++z); //46
        System.out.println(z++); //46
        System.out.println(z); //47

        int q = 30;

        System.out.println(--q); //29
        System.out.println(q--); //29
        System.out.println(q); //28


    }

}
