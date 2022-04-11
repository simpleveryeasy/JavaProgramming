package day15_ForLoop;



public class ForLoopReverseJava {

    public static void main(String[] args) {

        String word = "Java";
        String result = "";

        for (int i = 1; i <= 4; i++) {

                  result += word.charAt(4 - i);
        }

       System.out.println(result);


    }
}
