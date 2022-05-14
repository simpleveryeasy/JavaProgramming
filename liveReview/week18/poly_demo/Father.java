package week18.poly_demo;

public class Father extends Parent implements Worker{

    @Override
    public void raiseKid() {
        System.out.println("Raise");
    }

    @Override
    public void playWithKid() {
        System.out.println("Play");
    }

    @Override
    public void feedKid() {
        System.out.println("Feed");
    }

    @Override
    public void work(String job) {
        System.out.println("Working as " + job);
    }

    @Override
    public double getPaid() {
        return 1000;
    }
}
