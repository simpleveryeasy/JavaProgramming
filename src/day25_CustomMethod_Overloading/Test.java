package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        String s1 ="Cydeo School";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        String[] names = {"Anna", "Java", "Pyton", "racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println("count = " + count);

        String word1 = "Anna";
        String word2 = "Nana";
        boolean anagram = StringUtility.anagram(word1, word2);
        System.out.println("anagram = " + anagram);

        String s2 = "aaaabbbccccdddeeeee";
        String nonDuplicates = StringUtility.removeDuplicates(s2);
        System.out.println("nonDuplicates = " + nonDuplicates);

    }
}
