package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_Vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exception:

        int a = 10;
        int b = 0;

        //System.out.println(a/b); ArithmeticException: / by zero
        //System.out.println("Java"); can't be executed because preceding line is an exception

        char[] chars = {'A', 'B', 'C'};
        //               0    1    2
        //System.out.println(chars[99]); ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3

        Student student = null;
        //System.out.println(student.getName());  NullPointerException

        String str = "Wooden Spoon";
        str = null;
        //System.out.println(str.toUpperCase());  NullPointerException

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty());  //true
        System.out.println(str2.isBlank());  //true


        //checked exception

        System.out.println("hello");
        // Thread.sleep(3000);
        System.out.println("cydeo");


        //FileInputStream file = new FileInputStream("path of the file");




    }
}
