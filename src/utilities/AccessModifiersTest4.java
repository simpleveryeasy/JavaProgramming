package utilities;

import day40_FinalKeyWord.ProtectedAccessModifier;

public class AccessModifiersTest4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println(AccessModifiersTest4.name1); default isn't visible outside package
        System.out.println(AccessModifiersTest4.name2); //protected visible outside package only in subclass

        //AccessModifiersTest4.method1(); if not visible than can't be inherited
        AccessModifiersTest4.method2();

    }
}
