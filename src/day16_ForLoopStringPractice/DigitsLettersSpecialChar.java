package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChar {

    public static void main(String[] args) {

        String str = "Cydeo123456789000000School!@# $%WoodenSpoon";
        String digit = "";
        String specialChar = "";
        String loverCase = "";
        String upperCase = "";

        for (int i = 0; i <= str.length()-1 ; i++) {

            char ch = str.charAt(i);

            if (ch >= 48 && ch <= 57) {
                if(ch!='0') {
                    digit += ch;
                }
            } else if (ch >= 65 && ch <= 90) {
                upperCase += ch;
            } else if (ch >= 97 && ch <= 122){
                loverCase += ch;
            }else{
                if (ch != ' '){
                    specialChar += ch;
                }

            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("loverCase = " + loverCase);
        System.out.println("specialChar = " + specialChar);
        System.out.println("digit = " + digit);


    }
}
