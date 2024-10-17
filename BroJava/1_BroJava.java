package BroJava;
import java.util.Random;

class BroJava {
    public static void main(String[] args) {
        //  java source code - .java file 
        //  complier
        //  byte code - .class file - 
        //  JVM
        //  machine code - 0s and 1s

        //  JDK - Java Development Kit
        //  JRE - Java Runtime Environment
        //  JVM - Java Virtual Machine
        
        System.out.     println("Hello, World!");

        // data type     size      primitive/reference                   value
        // boolean       1 bit      primitive               false
        // byte         1 byte      primitive               -128 to 127
        // short        2 bytes     primitive               -32,768 to 32,767
        // int          4 bytes     primitive               -2 billion to 2 billion    
        // long         8 bytes     primitive               -9 quintillion to 9 quintillion
        // float        4 bytes     primitive               fractional number up to 6-7 digits
        // double       8 bytes     primitive               fractional number up to 15 digits
        // char         2 bytes     primitive               single character/ letter/ASCII value
        // String       varies      reference               a sequence of characters

        // primitive                                            reference
        // 8 types (boolean, byte, etc.)                       unlimited (user defined)
        // stores data                                         stores an address
        // can only hold 1 value                               could hold more than 1 value
        // less memory                                         more memory
        // fast                                                slower


        // Variables

        int variableName; // declaration    

        variableName = 10; // assignment

        String Name = "Ashwath N"; // initialization

        System.out.println("Hi!, My name is, "+Name);
        System.out.println("and I assigned the value, "+variableName+" to the variable, variableName");

        // variable swapping

        int a = 10;
        int b = 20;
        
        System.out.println("Before swapping, a = "+a+" and b = "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping, a = "+a+" and b = "+b);

        // random values
        Random random = new Random();   // thats kind of random

        //these are not true random numbers, they are pseudo random numbers

        int randomNumber = random.nextInt(69,96); // generates a random number between 69 and 96 
        double randomDouble = random.nextDouble(); // generates a random double value between 0.0 and 1.0
        boolean randomBoolean = random.nextBoolean(); // generates a random boolean value
        System.out.println("Random number between 69 and 96 is : "+randomNumber);
        System.out.println("Random double value is : "+randomDouble);
        System.out.println("Random boolean value is : "+randomBoolean);

        // constants
        final int constantName = 10; // final keyword is used to declare a constant

        // constantName = 20; // this will throw an error

        // 2d array
        int matrix[][] = new int[3][3]; // declaration of a 3x3 matrix

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for (int[] elements: matrix){
            for (int element: elements){
                System.out.print(element+" ");
            }
            System.out.println();
        }

        

    }
}        