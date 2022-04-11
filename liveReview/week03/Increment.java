package week03;

public class Increment {

    public static void main(String[] args) {

        int a =10;
        a = ++a;
        System.out.println(++a);

        int b = 5;
        b = b++;
        System.out.println(b);
        int c = a + b;
        System.out.println(b++);
        int d = c + b;
        System.out.println(b);
        System.out.println(b);

    }
}
