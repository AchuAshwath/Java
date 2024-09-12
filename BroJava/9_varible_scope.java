package BroJava;
import java.util.Random;

class variable_scope{
    public static void main(String[] args){
        // variable scope = the region of the program where a variable can be accessed

        // local variables = declared in a method
        //                   visible only to that method
        //                   destroyed when the method is completed

        // global variables = declared at the class level
        //                    visible to all methods

        DiceRoller diceRoller = new DiceRoller();
        // diceRoller.n_times_roll(5);
        DiceRoller diceRoller2 = new DiceRoller(3);


    }
}

class DiceRoller{

    // global variables of the class
    // can be accessed by all methods
    Random random = new Random();
    int number;     

    DiceRoller(){
        System.err.println();
        roll();
    }
    DiceRoller(int numberOfDice){   // overloaded constructor
        System.err.println();
        n_times_roll(numberOfDice);
    }
    
    void roll(){
        this.number = random.nextInt(6)+1;
        System.out.print(this.number+ " ");
    }

    void n_times_roll(int counter){     // local variable of the method
        for (int i = 0; i < counter; i++) {
            roll();
        }
    }

}