package day40_FinalKeyWord;

public class FinalVariable {

    final String birtDay;
    final static String name;

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birtDay) {
        this.birtDay = birtDay;
    }

    public final static void main(String[] args) {

        final double pi = 3.14;

        // pi = 4.14; final can't be reassigned

        final String name;
        name = "Java";
        //name = "Wooden Spoon"; final can only be initialized once

        System.out.println("___________________________");

        FinalVariable obj = new FinalVariable("May/01");
        System.out.println(obj.birtDay); //May/01

        //obj.birtDay = "June/01"; can't reassign

        //FinalVariable.name = "Python"; can't reassign
        System.out.println(FinalVariable.name); //Batch 25
        System.out.println(name); //Java
    }
}
