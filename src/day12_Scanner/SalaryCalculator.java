package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("hourly rate: ");
        double hourlyRate = input.nextDouble();

        System.out.println("hours to work in a week: ");
        double hours = input.nextDouble();

        System.out.println("state tax: ");
        double stateTax = input.nextDouble() / 100;

        System.out.println("federal tax: ");
        double federalTax = input.nextDouble() / 100;

        input.close();

        double salary = hourlyRate * hours * 52;

        double stateTaxAmount = salary * stateTax;
        double federalTaxAmount = salary * federalTax;
        double totalTax = stateTaxAmount + federalTaxAmount;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTaxAmount = " + stateTaxAmount);
        System.out.println("federalTaxAmount = " + federalTaxAmount);
        System.out.println("netIncome = " + netIncome);


    }
}
/*
3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */