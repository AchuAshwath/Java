package BroJava;
import java.util.Scanner;
import java.util.InputMismatchException;

class JavaException {
    public static void main(String[] args) {
        ArithmetoDivide obj = new ArithmetoDivide(0, 0);
        obj = ArithmetoDivide.getInput();
        double result = obj.divide(obj);
        System.out.println("The result is: " + result);

    }

}
class ArithmetoDivide{
    Number number1;
    Number number2;
    ArithmetoDivide(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    ArithmetoDivide(double number1, double number2){
        this.number1 = (int)number1;
        this.number2 = (int)number2;
    }
    static ArithmetoDivide getInput(){
        Scanner input = new Scanner(System.in);
        
        // get two numbers
        try{
            System.out.println("Enter the first number: ");
            int x = input.nextInt();
            System.out.println("Enter the second number: ");
            int y = input.nextInt();
            // create an object of the ArithmetoDivide class
            ArithmetoDivide obj = new ArithmetoDivide(x, y);
            input.close();
            return obj;
        }catch(InputMismatchException e){
            System.out.println("Please enter a valid number");
            input.close();
             return getInput();
        }catch(Exception e){
            System.out.println("An error occurred");
            input.close();
            return getInput();
        }finally{
            input.close();
            System.out.println("your inputs have been recieved successfully!");
        }
    }
    
    int divide(ArithmetoDivide obj) {
        int result = 0;
        try {
            result = obj.number1.intValue() / obj.number2.intValue();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            getInput();
        }
        return result;
    }


    double divide2double(ArithmetoDivide obj) {
        double result = 0;
        try {
            result = obj.number1.doubleValue() / obj.number2.doubleValue();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            getInput();
        }
        return result;
    }
}