package week12;

public class Value {

    /*
    Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: if setVal has ever been called,
it getVal returns the last value passed to setVal. Otherwise if the "single int parameter"
constructor was used to create the object, getVal returns the value passed to that constructor.
Otherwise getVal returns 0.
     */

    int param = 0;
    boolean wasModified = false;
    boolean usedConstructor = false;
    public Value(){} // no parameter constructor
    public Value(int param){ // single parameter constructor
        this.param = param;

    }
    public void setVal(int param){ // single parameter void method
        this.param = param;
        wasModified = true;
    }
    public boolean wasModified(){
        return wasModified;
    }
    public int getVal(){
            return this.param;
    }

    public String toString() {
        return "Value{" +
                "param=" + param +
                ", wasModified=" + wasModified +
                ", usedConstructor=" + usedConstructor +
                '}';
    }
}
