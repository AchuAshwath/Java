package BroJava.interfaces;

public class Deer implements prey {
    @Override
    public void run() {
        System.out.println("Deer is running");
    }
    void eat() {
        System.out.println("Deer is eating the grass");
    }
}
