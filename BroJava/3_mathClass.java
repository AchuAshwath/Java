package BroJava;
import java.util.Scanner;
class mathClass {
    public static void main(String[] args) {

        // Math Class
        // Math class is a built-in class in java that contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.

        // max method
        int max = Math.max(10, 20);
        System.out.println("The maximum number between 10 and 20 is : "+max);

        // min method
        int min = Math.min(10, 20); 
        System.out.println("The minimum number between 10 and 20 is : "+min);

        // abs method
        int abs = Math.abs(-10);
        System.out.println("The absolute value of -10 is : "+abs);

        // sqrt method
        double sqrt = Math.sqrt(25);
        System.out.println("The square root of 25 is : "+sqrt);

        // round method
        double round = Math.round(5.5);
        System.out.println("The rounded value of 5.5 is : "+round);

        // ceil method
        double ceil = Math.ceil(5.1);
        System.out.println("The ceiling value of 5.1 is : "+ceil);  // rounds up

        // floor method
        double floor = Math.floor(5.9);
        System.out.println("The floor value of 5.9 is : "+floor);  // rounds down

        // calculating the hyponenuse of a right angled triangle

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle : ");
        double base = Double.parseDouble(input.nextLine());
        System.out.print("Enter the height of the triangle : ");
        double height = Double.parseDouble(input.nextLine());

        // formula to calculate the hypotenuse of a right angled triangle
        // hypotenuse = sqrt(base^2 + height^2)

        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println("The hypotenuse of the triangle is : "+hypotenuse);

        input.close();


    }   
}
