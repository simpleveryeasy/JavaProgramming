package week05;

public class DynamicSubstring {

    public static void main(String[] args) {

        String searchResult = "result count: 12345";
        System.out.println(searchResult.substring(14));
        System.out.println(searchResult.substring(14, 19));

        System.out.println(searchResult.indexOf(":"));

        System.out.println(searchResult.substring(searchResult.indexOf(":")+2));
    }
}
