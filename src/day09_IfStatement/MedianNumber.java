package day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10, b = 15, c = 20;

        boolean aIsMedian = (b > a && c < a) || (b < a && c > a);
        boolean bIsMedian = (c > b && a < b) || (c < b && a > b);
        boolean cIsMedian = (a > c && b < c) || (a < c && b > c);
        boolean noMedian = !aIsMedian && !bIsMedian && !cIsMedian;

        if (aIsMedian) {
            System.out.println(a + " is the median number");
        }
        if (bIsMedian) {
            System.out.println(b + " is the median number");
        }
        if (cIsMedian) {
            System.out.println(c + " is the median number");
        }
        if (noMedian) {
            System.out.println("there is no median number");
        }

    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number

 */