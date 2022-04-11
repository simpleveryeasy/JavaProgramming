package day32_Constructor;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(3, 5, 8, true);
        System.out.println(carpet1);

        Carpet carpet2 = new Carpet(10, 20, 10, false);
        System.out.println(carpet2);
    }
}
