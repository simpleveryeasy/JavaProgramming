package week08;

import java.util.Arrays;

public class ArrayExample01 {

    public static void main(String[] args) {

        int code =200;

        int[] codes = new int[8];
        System.out.println(Arrays.toString(codes));

        codes[0] = 200;
        codes[1] = 201;
        System.out.println(codes[0]);
        System.out.println(Arrays.toString(codes));

        int[] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500};

        System.out.println("___________________size of an array________________");

        System.out.println("the size of array is " + statusCodes.length);

        int sizeOfArray = statusCodes.length;

        String[] responseTypes = new String[]{"OK", "Created", "No Content", "Bad Request", "Unauthorized", "Forbidden",
        "Not Found","Internal Server Error"};

        for (int i = 0; i < responseTypes.length; i++) {
            String text = statusCodes[i]+ " : " + responseTypes[i];
            System.out.println("Status code means: " + text);
        }
    }
}
