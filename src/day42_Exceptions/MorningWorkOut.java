package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("---------------Push up started--------------");

        for (int i = 1; i <=10 ; i++) {
            System.out.print("\rPush up " + i);
            sleep(1);
        }

        System.out.println("\n---------------Push up finished--------------");

        System.out.println("---------------Pull up started--------------");

        for (int i = 1; i <=10 ; i++) {
            System.out.print("\rPull up " + i);
            sleep(1.5);
        }

        System.out.println("\n---------------Pull up finished--------------");

    }

    public static void sleep(double second){ //**********************************************************

        try {
            Thread.sleep( (long) (second * 1000) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
MorningWorkOut:
1. Do 10 push-ups and try pausing 1 seconds
in each
2. Do 10 Pull-ups and try pausing 1.5 seconds
in each
 */