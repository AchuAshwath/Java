import java.util.Scanner;

class inputs{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // creating a scanner object
        // yellow line - warning, says that there is a Resource leak: 'java.util.Scanner' is never closed
        // this is because the scanner object has to be closed or else it will stay open and consume memory
        // to close the scanner object, use the close() method
        // input.close();

        // the print method doesnt add a new line after the output
        System.out.print("Enter your name : ");   // getting input from the user
        String name = input.nextLine(); // getting a string input
        System.out.print("Enter your roll number : ");    
        int age = input.nextInt();  // getting an integer input
        System.out.print("Enter your attendance : ");
        double attendance = input.nextDouble(); // getting a double input
        
        System.out.print("are you a java developer?");
        boolean isJavaDeveloper = input.nextBoolean(); // getting a boolean input
        
        // Exception in thread "main" java.lang.NumberFormatException: For input string: ""
        // the nextLine method consumes the newline character after the input
        // but the nextInt or nextDouble or nextBoolean methods dont consume the newline character
        // so we have to consume the newline character manually
        input.nextLine(); // consuming the newline character
        
        // parsing the input
        System.out.print("how long have you been learning java? ");
        int days = Integer.parseInt(input.nextLine()); // parsing the integer input

        // try double parsing

        System.out.printf("hi my name is %s and my age is %d i have a attendance of %f \nam I a java developer? \n%b \nbut i have been learning java for %d days", name, age, attendance, isJavaDeveloper, days);

        input.close(); // closing the scanner object

    }
}
