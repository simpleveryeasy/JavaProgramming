package week14;

import java.util.ArrayList;

public class FinalKeyword {

    final int b;  // initialization is mandatory
    final static int c;
    //   final int d; compiler error
    //   d=10;

    public FinalKeyword(int b){
        this.b=b;
    }

    static {
        //   b= 10; Because static block cannot access to instance members
        c=5;
    }



    public static void main(String[] args) {

        // local variables:if we don’t use it, initialization is not mandatory.
        final int a;
        a=100;
        System.out.println(a);

        final int[] nums = {1, 2, 3};
        System.out.println(nums[0]);
        nums[0] = 5;
        System.out.println(nums[0]);

        //nums = new int[]{5, 6, 7}; can not reassign another array object to final reference variable

        // Final ArrayList
        final ArrayList <String> colors = new ArrayList<>();

        colors.add("orange");
        colors.add("red");

        colors.remove(0);

        //colors = new ArrayList<>(); ----->error
        // final keyword is used for variables, here colors name is variable so can not reassign
    }
}
