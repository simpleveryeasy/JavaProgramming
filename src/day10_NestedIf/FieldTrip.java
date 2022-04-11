package day10_NestedIf;

import java.util.Scanner;

public class FieldTrip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a grade: ");
        int g = input.nextInt();

        String grade = "grade - " + g;
        String location = "",
                teacher = "";
        int groupNumber = 0;

        if (g >= 1 && g <= 6) {

            if (g == 1) {

                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms.Smith";
            } else if (g == 2) {

                location = "zoo";
                groupNumber = 7;
                teacher = "Mr.Lee";
            } else if (g == 3) {

                location = "aquarium";
                groupNumber = 5;
                teacher = "Ms.Wilson";
            } else if (g == 4) {

                location = "movie theatre";
                groupNumber = 2;
                teacher = "Ms.Reyes";
            } else if (g == 5) {

                location = "museum";
                groupNumber = 5;
                teacher = "Ms.Lela";
            } else {

                location = "six flags";
                groupNumber = 8;
                teacher = "Mr.Watt";
            }

            System.out.println(grade + "\nlocation - " + location + "\nnumber of groups - " + groupNumber
                    + "\nteacher in charge - " + teacher);

        } else {
            System.out.println("invalid number");
        }
input.close();

    }
}

/*
8. Create a class called FieldTrip. Your school goes on a Field trip each year.
The place you go will be based on your grade.
Given a variable gradeNumber (1-6) figure out the details of your field trip.
Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt


 */