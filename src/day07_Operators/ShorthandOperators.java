package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        // assignment operator: =
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number); //200

        String word = "Java programming";
        System.out.println("word = " + word); //Java programming

        word = "Wooden spoon";
        System.out.println("word = " + word); //Wooden spoon

        System.out.println("___________________________________________");

        // addition assignment operator: +=
        int x = 100;
        System.out.println("x = " + x); //100

        // x = x + 200;
        x +=200;
        System.out.println("x = " + x); //300

        String str = "Wooden";
        System.out.println("str = " + str); //Wooden

        str += " Spoon";
        System.out.println("str = " + str); //Wooden Spoon

        double num1 = 2.5;
        System.out.println("num1 = " + num1);//2.5

        num1 += 5.5;
        System.out.println("num1 = " + num1);//8.0

        double availableBalance = 1000.50;

        // deposit $300
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance);//$1300.5

        System.out.println("___________________________________________");

        // subtraction assignment operator: -=
        // withdrawing $500
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);//$800.5

        // withdraw $200, than deposit $400
        availableBalance -= 200;
        availableBalance += 400;
        System.out.println("availableBalance = " + availableBalance);//$1000.5

        System.out.println("___________________________________________");

        // multiplication assignment operator: *=
        double salary = 5000.5;
        salary *= 2;
        System.out.println("salary = " + salary);//$10001.0

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);//0.01

        System.out.println("___________________________________________");

        // division assignment operator: /=
        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);//12500

        System.out.println("___________________________________________");

        // remainder assignment operator: %=
        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);//1

        System.out.println("_______________________________");

        int amount = 127;//cents
        int quarters = amount / 25;
        int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int cents2 =127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);//2

        System.out.println("_____________________________");

        int y = 300;
        y %= 16;
        System.out.println("y = " + y);

        int balance = 3500;
        // insurance fee: $153
        balance %= 153;






    }

}
