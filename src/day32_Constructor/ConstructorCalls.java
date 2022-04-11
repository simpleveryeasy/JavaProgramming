package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor"); ////Default Constructor
    }

    public ConstructorCalls(int a){
        this();                                                 //Default Constructor
        System.out.println("Constructor with int argument");    //Constructor with int argument
    }

    public ConstructorCalls(String str){
        this(10);                                           //Default Constructor, Constructor with int argument
        System.out.println("Constructor with String argument");    //Constructor with String argument
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls(); //Default Constructor

        System.out.println("_______________________");

        ConstructorCalls obj2 = new ConstructorCalls(10); //Default Constructor + Constructor with int argument

        System.out.println("_______________________");

        ConstructorCalls obj3 = new ConstructorCalls("Java");  //Default Constructor + Constructor with int argument
                                                              // + Constructor with String argument
    }
}
