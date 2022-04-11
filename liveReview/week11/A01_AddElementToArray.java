package week11;

import java.util.Arrays;

public class A01_AddElementToArray {

    public static void main(String[] args) {

        String[] browsers = {"Chrome", "Firefox", "Safari"};
        String newBrowserOne = "Edge";
        String newBrowserTwo = "Opera";

        browsers = addElement(browsers, newBrowserOne);
        System.out.println(Arrays.toString(browsers)); //[Chrome, Firefox, Safari, Edge]

        browsers = addElement(browsers, newBrowserTwo);
        System.out.println(Arrays.toString(browsers)); //[Chrome, Firefox, Safari, Edge, Opera]
    }

    public static String[] addElement (String[] arr, String element){
        String[] newArray = new String[arr.length+1];
        int i = 0;
        for ( ; i<arr.length; i++){
            newArray[i] = arr[i];
        }
        newArray[i] = element;
        return newArray;
    }
}
