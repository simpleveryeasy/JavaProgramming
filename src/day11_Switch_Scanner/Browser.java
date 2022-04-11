package day11_Switch_Scanner;


import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter browser name: ");
        String browserName = input.next();
        String result = "";

        boolean validBrowser = browserName.equals("chrome") || browserName.equals("firefox") || browserName.equals("opera")
                || browserName.equals("safari") || browserName.equals("edge");


        if (validBrowser) {

            if (browserName.equals("chrome")) {
                result = "chrome browser is selected";
            } else if (browserName.equals("firefox")) {
                result = "firefox browser is selected";
            } else if (browserName.equals("opera")) {
                result = "opera browser is selected";
            } else if (browserName.equals("safari")) {
                result = "safari browser is selected";
            } else {
                result = "edge browser is selected";
            }
        } else {
            result = "invalid browser name";
        }
        System.out.println(result);

        input.close();


    }

}

/*
1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declare a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if
 */