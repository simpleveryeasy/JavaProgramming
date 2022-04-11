package week05;

public class StringExample {

    public static void main(String[] args) {
        /*
        length(): it does not take parameter, it returns an integer number
         */

        String message = "EU8 is Awesome!!";
        int count = message.length();
        System.out.println("how may characters we have : " + count);
        System.out.println(count == 16);
        if (message.length() == 16) {
            System.out.println("happy testing");
        }

        String str3 = " EU8 Awesome ";
        str3 = str3.trim().replaceFirst(" ", "");
        System.out.println(str3);

        String str4 = " EU8 Awesome ";
        str4 = str4.trim().replaceFirst(" ", "").toUpperCase().substring(3);
        System.out.println(str4);


    }
}
