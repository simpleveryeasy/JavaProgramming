package week12;

public class TelephoneTest {

    public static void main(String[] args) {

        System.out.println(Telephone.total); // first calls static block to initialize static variables

        Telephone telephone = new Telephone(); // this code also first calls static block to initialize static variables
    }
}
