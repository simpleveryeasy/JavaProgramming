package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int count = 0;

        for (int i = 0; i <= word.length()-4; i++) {

            String eachSub = word.substring(i, i+4);

            if (eachSub.equalsIgnoreCase("java")) {
                count++;
            }

        }
        System.out.println(count);
        scan.close();

    }
}
/*
Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)



        	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"

 */
