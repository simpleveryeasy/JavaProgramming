package week05;

import java.util.Scanner;

public class EmailCheckInterview {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = scan.next();
        scan.close();
        boolean res = true;

        if(email.indexOf("@") > 0 && email.lastIndexOf(".") > email.indexOf("@")) {
            res =email.indexOf("@") > 0 && email.lastIndexOf(".") > email.indexOf("@");
        }else{
            res = email.indexOf("@") > 0 && email.lastIndexOf(".") > email.indexOf("@");
        }
        System.out.println(res);

    }
}
/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */
/*
indexof("@")<1 :  0 (no character before @ sign) or -1 (there is no @ sign)
        indexof("@") >= email.length()-3   (a@a.a: indexof("@):length()-4 )
        what if we have 2 @ signs :
        the index of @ sign == last index of @ sign: there is one @ sign, otherwise problem
        DOT Conditions
        indexof(".")<1 :  0 (no character before dot sign) or -1 (there is no dot sign)
        indexofDotSign == email.length()-1 : problem
        the index of @ sign > bigger than indexofDotSign: problem
        the index of @ sign + 1 ==  indexofDotSign (@.): there is no character in between : problem
 */