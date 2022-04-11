package day14_String;

public class StringMethods4 {

    public static void main(String[] args) {

        String str = "Cydeo";
        String str2 = str.repeat(4);
        System.out.println("str = " + str); // str = Cydeo
        System.out.println("str2 = " + str2); // str2 = CydeoCydeoCydeoCydeo
        
        String s1 = "Wooden Spoon ";
        String s2 = s1.repeat(10);
        System.out.println("s2 = " + s2);

        System.out.println("________________________");

        System.out.println("FADY ".repeat(10));
        System.out.println("FADY\n".repeat(10));

        String name = "Java";
        System.out.println((name + " ").repeat(5));
        System.out.println((name + "\n").repeat(5));

    }
}
