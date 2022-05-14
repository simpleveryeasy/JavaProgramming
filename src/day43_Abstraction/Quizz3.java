package day43_Abstraction;

interface Quizz1 {

void read();
abstract void watch();
}

abstract class Quizz2 implements Quizz1{
    public void read(){
        System.out.println("as");
    }

}

public class Quizz3 extends Quizz2 {

    @Override
    public void read() {
        super.read();
    }

    @Override
    public void watch() {

    }
}
