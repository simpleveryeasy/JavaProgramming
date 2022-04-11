package day06_PrimitiveTypeCastings;

public class PrimativeCastings {

    public static void main(String[] args) {

        //implicit casting
        byte a = 100;
        short b = a;

        int c = b;

        long d = c;

        float e = d;

        double f = e;

        System.out.println("__________________________________________________");

        //explicit casting
        int x = 55;
        short y = (short)x;

        long j = 1_000_000;
        short k = (short)j;
        System.out.println("k = " + k);

        double l = 2.5;
        float m = (float)l;

        double n = 10.8;
        int o = (int)n;
        System.out.println(n + ":" + o);

        System.out.println("__________________________________________________");

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + ":" + s1);

        float f1 = 30.5f;
        long l1 = (long) f1;
        System.out.println(f1 + ":" + l1);






        /*
        int e = 2_000_000_000;
        long f = (long)e * (long)e;
        long g = f;
        System.out.println("g = " + g);

         */



    }

}
