package BroJava.interfaces;

class interfaces {
    public static void main(String[] args) {
        Lion myLion = new Lion();
        myLion.roar();
        myLion.hunt();

        Deer myDeer = new Deer();
        myDeer.run();

        // myDeer.hunt(); // Error: prey cannot be converted to predator
        
        Fish myFish = new Fish();
        myFish.run();
        myFish.hunt();
        
    }
    
}
