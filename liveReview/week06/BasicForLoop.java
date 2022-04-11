package week06;

public class BasicForLoop {

    public static void main(String[] args) {


        for (int i = 0; i <= 100; i+=10) {
            System.out.print(i+" ");
        }

        System.out.println("\n______________________________________\n");

        int z = 0;

        for ( ; z <= 100 ; ) {
            System.out.print(z+" ");
            z+=10;
        }

        System.out.println("\n______________________________________\n");

        for (int i = 3 ; i < 30 ; i += 2) {
            System.out.print(i+ " ");
        }

        System.out.println("\n______________________________________\n");

        int count = 0;
        for (int i = 5; i <= 50 ; i++) {
            if (i%2==0) {
                count++;
            }
        }
        System.out.print("even numbers 5 to 50 : "+count);

        System.out.println("\n______________________________________\n");

        int j = 1;
        for ( ; j <= 10 ;  j++) {
            System.out.println("12 x " + j + "= "+(12*j));
        }

        System.out.println("\n______________________________________\n");





    }
}
