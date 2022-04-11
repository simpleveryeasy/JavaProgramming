package day15_ForLoop;

public class ForLoopAlphabet {

    public static void main(String[] args) {

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i = 'Z'; i>='A'; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char i = 'z'; i>='a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("_____________________________");

        for(int i = 65; i<=90; i++){
            System.out.print((char)i+ " ");
        }
        System.out.println();

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i = 'A'; i <= 'Z'; i++){
            System.out.print((char)i + " ");
        }
        System.out.println(" ");

        System.out.println("__________________________________");

        for(char i = 1; i <=400; i++){
            System.out.print(i+" ");
        }
        System.out.println();


    }
}
/*
                    print:
                    A to Z
                    a to z
                    Z to A
                    z to a
 */