package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String whiteSpace = "   batch 25      ";
        whiteSpace = whiteSpace.trim(); //"batch 25"


        System.out.println(whiteSpace);

        String str1 = "Cydeo School";

        int n1 = str1.indexOf("h");
        System.out.println("n1 = " + n1); // n1 = 8
        int n = str1.indexOf(" ");
        System.out.println("n = " + n); // n = 5

        int n2 = str1.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str2 = "Java Programming Language";
        int n3 = str2.indexOf("am");
        System.out.println("n3 = " + n3);
        int n4 = str2.indexOf("g");
        System.out.println("n4 = " + n4);
        int n5 = str2.indexOf("g ");
        System.out.println("n5 = " + n5);
        int n6 = str2.lastIndexOf("g");
        System.out.println("n6 = " + n6);

        System.out.println("______________________________");

        String s = "Java Nova Cava Wava orange";

        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA); // firstA = 1
        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA); // lastA = 22
        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
        int otherThirdA = s.lastIndexOf("a C");
        System.out.println("otherThirdA = " + otherThirdA);
        // int fourthA = s.indexOf("ava W");
        int fourthA = s.indexOf("Ca") +1;
        System.out.println("fourthA = " + fourthA);
        int fifthA = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);
        int sixthA = s.lastIndexOf("av");
        System.out.println("sixthA = " + sixthA);
        int seventhA = s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);
        int eighthA = s.lastIndexOf("a");
        System.out.println("eighthA = " + eighthA);



    }
}
