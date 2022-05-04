package day42_Exceptions;


//Custom Unchecked exceptions
class FadyExceptions extends RuntimeException {

    public FadyExceptions() {
        super("It is a time for a short break");
    }

    public FadyExceptions(String message) {
        super(message);
    }
}

//Custom Checked exceptions
class NoBreakException extends Exception {

}

public class CustomExceptions {

    public static void main(String[] args) {


        //unchecked exception
        /*try {
            throw new FadyExceptions("It is a time for a lunch break");
        }catch (FadyExceptions e){
            e.printStackTrace();
            System.out.println("catch block1");
        }*/

        //checked exception

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
            System.out.println("catch block2");
        }

    }

}
