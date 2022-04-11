package week10;

public class CalculateRetirement {

    public static void main(String[] args) {
        yearsUntilRetirement("Mavan", 1985);

    }

    public static int calculateAge(int yearOfBird){
        return 2022 - yearOfBird;
    }

    public static void yearsUntilRetirement(String name, int yearOfBird){
        int yearsUntilRetirement = 65 - calculateAge(yearOfBird);
        System.out.println(name + " retires in " + yearsUntilRetirement + " years");
    }
}
