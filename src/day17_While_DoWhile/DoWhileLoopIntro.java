package day17_While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;

        for (int i = 0; a ; ) {
            System.out.println("Wooden Spoon -- for loop");
        }

        System.out.println("______________________________");

        while(a){
            System.out.println("Wooden Spoon -- while loop");
        }

        System.out.println("______________________________");

        do {
            System.out.println("Wooden Spoon -- do-while loop");
        }while(a);


    }
}
