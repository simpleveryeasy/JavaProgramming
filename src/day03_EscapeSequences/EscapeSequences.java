package day03_EscapeSequences;

/*
Escape sequences Must be given withen the double quote

\n---Newline--------Advances the cursor to the next line for subsequent printing
\t---HorizontalTab--Causes the cursor to skip over to the next tab stop
\\---Backslash------Causes a backslash to be printed
\"---Double quote---Causes a double quotation mark to be printed
 */

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPyton \nC#\n");
        System.out.println("--------------------------------------\n");

        System.out.println("Hello Cydeo How are you all today? It's nice to see you all! What class do you have next week?\n");
        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do you have next week?");

        System.out.println("\n-------------------------------------\n");
        System.out.println("\tJava is cool programming language\n");
        System.out.println("\n-------------------------------------\n");

        System.out.println("/ \\\\\\\n"); // in order to print "/" you have to use two times more "/"
        System.out.println("\n-------------------------------------\n");

        System.out.println("My favorite TV show is \"Games of Throne.\"\n");






    }

}
