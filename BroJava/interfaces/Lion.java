package BroJava.interfaces;

public class Lion implements predator{
    @Override
    public void hunt(){
        System.out.println("Lion is hunting");
    }
    public void roar(){
        System.out.println("Lion is roaring");
    }
    
}