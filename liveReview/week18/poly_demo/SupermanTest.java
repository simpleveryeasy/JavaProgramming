package week18.poly_demo;

public class SupermanTest {

    public static void main(String[] args) {

        Parent supermanOne = new Father(); // you can reach parent abstract class methods but not worker

        supermanOne.feedKid();
        supermanOne.playWithKid();
        supermanOne.raiseKid();

        //supermanOne.work("SDET"); ERROR
        System.out.println("_________________________________");


        Worker supermanTwo = new Father(); // you can reach worker interface methods but not parent

        supermanTwo.getPaid();
        supermanTwo.work("SDET");

       // supermanTwo.feedKid();  ERROR
        System.out.println("_________________________________");



        Father supermanThree = new Father();

        supermanThree.feedKid();
        supermanThree.playWithKid();
        supermanThree.raiseKid();
        supermanThree.work("SDET");
        supermanThree.getPaid();

        System.out.println("_________________________________");

        boolean b1 = supermanOne instanceof Father;
        boolean b2 = supermanTwo instanceof Father;
        boolean b3 = supermanThree instanceof Father;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        ((Worker)supermanOne).work("Engineer");
        ((Worker)supermanOne).getPaid();

        ((Parent)supermanTwo).feedKid();
        ((Parent)supermanTwo).raiseKid();
        ((Parent)supermanTwo).playWithKid();
    }
}
