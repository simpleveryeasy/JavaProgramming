package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 100;

        double lira = dollar * 9.53;
        double euro = dollar * 0.86;
        // jpy, pound, peso, cad, riyal, rub,
        double jpy = dollar * 114.46;
        double pound = dollar * .87;
        double peso = dollar * 3.45;
        double cad = dollar * 1.25;
        double riyal = dollar * 2.55;
        double rub = dollar * 5.45;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("peso = " + peso);
        System.out.println("cad = " + cad);
        System.out.println("riyal = " + riyal);
        System.out.println("rub = " + rub);

    }

}
