package utilities;

import day40_FinalKeyWord.ProtectedAccessModifier;

public class AccessModifiersTest3 {

    public static void main(String[] args) {

        //System.out.println(ProtectedAccessModifier.name1); name1 has default access modifier,
        // so isn't visible outside its package

        //System.out.println(ProtectedAccessModifier.name2); name2 has protected access modifier,
        // so only visible outside its package if it's in the subclass
    }
}
