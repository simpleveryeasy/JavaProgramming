package day16_ForLoopStringPractice;

public class ForLoopReverseString {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String result = "";                                        // to contain the reverse version of str

        for(int i = str.length()-1; i >= 0; i--){        // i: index number of str (starting last index to index 0)

                result += str.charAt(i);
        }
        System.out.println(result);
    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */