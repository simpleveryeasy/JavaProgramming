package week09;

import org.w3c.dom.ls.LSOutput;

public class CustomMethodPractice {

    public static void main(String[] args) {

        int personOneAge = 10;
        if (personOneAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        int personTwoAge = 20;
        if (personTwoAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        eligibleOrNot(10);
        eligibleOrNot(personOneAge);
        eligibleOrNot(personTwoAge);
    }


    public static void eligibleOrNot(int age){

        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }
}
