package week10;

public class WrapperClass {

    public static void main(String[] args) {

        int i1 = 100;
        Integer i2 = i1; //autoboxing: from primitive to object type

        // explicit example
        Long i3 = (long)i1; //Non-primitive Long needs explicit casting
        long l3 = i1; //Primitive larger type does not need explicit casting

        Integer n1 = 300;
        int n2 = n1; //unboxing: from object to primitive

        String str = "123";
        System.out.println(str +1); //1231

        int num = Integer.parseInt(str);    // parse turns value to primitive data type
        System.out.println(num +1); //124
        Integer num2 = Integer.valueOf(str); // valueOf turns primitive data type to object value(Wrapper class)
        System.out.println(num2+1);

        String price ="$27.16";
        price = price.substring(1);
        double priceInDouble = Double.parseDouble(price);
        System.out.println(priceInDouble);// 27.16
        Double priceInWrapperDouble = Double.valueOf(price);
        System.out.println(priceInWrapperDouble); //27,16

        String str1 = "a1b2c3";
        // sum of integers inside str1
        int sumOfDigits = 0;

        for (char each : str1.toCharArray()){
            if (Character.isDigit(each)){
                sumOfDigits += Integer.parseInt(each+"");
            }
        }
        String strThree = "abcd1234!@#$efghi6789#$%^ABCD";

        String letters = "";
        String uppercaseLetters = "";
        String lowerCaseLetters = "";
        String digits = "";
        String specialChars = "";

        for (char each : strThree.toCharArray()) {   // char each : primitive
            if(Character.isLetter(each)){
                letters+=each;
                if(Character.isUpperCase(each)){
                    uppercaseLetters += each;
                }else{
                    lowerCaseLetters += each;
                }
            }else if (Character.isDigit(each)){
                digits += each;
            }else{
                specialChars += each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("lowerCaseLetters = " + lowerCaseLetters);
        System.out.println("uppercaseLetters = " + uppercaseLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
