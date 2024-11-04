import java.util.Arrays;
class loops {
    public static void main(String[] args) {
        // Loops

        // while loop
        // syntax
        // while(condition){
        //     // code block
        // }
        int i = 0;
        while(i < 5){
            System.out.println("i is : "+i);
            i++;
        }
        // try to print numbers from 10 to 1

        // do while loop
        // syntax
        // do{
        //     // code block
        // }while(condition);
        int j = 0;
        do{
            System.out.println("j is : "+j);
            j++;
        }while(j < 5);

        // the difference between while and do while loop is that 
        // the do while loop will execute the code block at least once even if the condition is false
        // where the while loop will not execute the code block if the condition is false

        // for loop
        // syntax
        // for(initialization; condition; increment/decrement){
        //     // code block
        // }

        // for loops - from 1 to 10
        for(int startingNumber = 1; startingNumber <= 10; startingNumber++){
            System.out.println("k is : "+startingNumber);
        }

        //try to odd numbers from 1 to 10
        for(int oddNumber = 1; oddNumber <= 10; oddNumber+=2){
            System.out.println("oddNumber is : "+oddNumber);
        }

        // try to print even numbers from 1 to 10 using conditional statements
        for(int evenNumber = 1; evenNumber <= 10; evenNumber++){
            if(evenNumber % 2 == 0){
                System.out.println("evenNumber is : "+evenNumber);
            }
        }


        for(int row = 0; row < 5; row++){
            for(int column = 0; column < row; column++){
                System.out.print("*");
            }
            System.out.println();
        }

        // for each loop
        // syntax
        // for(dataType variableName : arrayName){
        //     // code block
        // }
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        for(char vowel : vowels){
            System.out.println("Vowel at the index "+ Arrays.binarySearch(vowels, vowel) + " is : "+vowel);
        }

        // try to print multiplication tables
        for(int table = 1; table <= 10; table++){
            System.out.println("Multiplication table of "+table+", till 10");
            for(int multiplier = 1; multiplier <= 10; multiplier++){
                System.out.print(table+" * "+multiplier+" = "+(table*multiplier)+"\n");
            }
        }

        //*****
        //*****
        //**
        //*****
        //***** 

        // nested for loop with break statement
        for(int row = 0; row < 5; row++){
            for(int column = 0; column < 5; column++){
                if(row == 2 && column == 2){
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // multi-dimensional array
        int matrix[][] = new int[3][3]; // declaration of a 3x3 matrix

        int matrix2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // declaration and initialization of a 3x3 matrix

        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                System.out.print(matrix2[row][column]+" ");
            }
            System.out.println();
        }

    }
}
