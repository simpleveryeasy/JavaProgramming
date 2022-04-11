package week04;

import java.util.Scanner;

public class TrafficLightSelector {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        char color = input.next().charAt(0);

        switch (color) {
            case 'R': case 'r':
                System.out.println("Red Light");
                break;
            case 'O' : case 'o':
                System.out.println("Orange Light");
                break;
            case 'G' : case 'g':
                System.out.println("Green Light");
                break;
            default:
                System.out.println("invalid light");
        }
    }
}
