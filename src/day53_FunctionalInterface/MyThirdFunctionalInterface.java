package day53_FunctionalInterface;

@FunctionalInterface
public interface MyThirdFunctionalInterface<T> {

    //Create a Functional interface named MyThirdFunctionalInterface that has an abstract method
    // takes one argument of any type and returns the same type

    T method(T t);
}
