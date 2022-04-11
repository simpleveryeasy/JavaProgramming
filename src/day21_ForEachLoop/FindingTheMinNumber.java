package day21_ForEachLoop;

public class FindingTheMinNumber {

    public static void main(String[] args) {

        int[] numbers = {5, 4, 6, 8, 7};
        int min = numbers[0];

        for (int each : numbers) {
            if (each<min)
            min=each;
        }
        System.out.println(min);


    }
}
