package BroJava.interfaces;

public class Fish implements prey, predator {
    @Override
    public void run() {
       System.out.println("Fish is swimming away from a larger fish");
    }
    @Override
    public void hunt() {
        System.out.println("Fish is hunting a smaller fish");
    }
    void eat() {
        System.out.println("Fish is eating the algae");
    }
    
}
