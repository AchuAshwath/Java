import java.util.Scanner;

class conditionalSatements{
    public static void main(String[] args) {
        // Conditional Statements

        Scanner input = new Scanner(System.in);
        System.out.print("Can you enter your age please : ");
        int age = Integer.parseInt(input.nextLine());

        // if else
        if(age >= 18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are a minor");
        }

        System.out.print("what mark did you get in programming? : ");
        int marks = Integer.parseInt(input.nextLine());
        
        // if else if else
        if(marks >= 90){
            System.out.println("You got an A grade");
        }else if(marks >= 80){
            System.out.println("You got a B grade");
        }else if(marks >= 70){
            System.out.println("You got a C grade");
        }else if(marks >= 60){
            System.out.println("You got a D grade");
        }else{
            System.out.println("You got an F grade");
        }

        System.out.print("which day of the week is it? : ");
        int day = Integer.parseInt(input.nextLine());
        
        // switch case
        switch(day){
            case 1:
                System.out.println("then it is Sunday");
                break;
            case 2:
                System.out.println("then it is Monday");
                break;
            case 3:
                System.out.println("then it is Tuesday");
                break;
            case 4:
                System.out.println("then it is Wednesday");
                break;
            case 5:
                System.out.println("then it is Thursday");
                break;
            case 6:
                System.out.println("then it is Friday");
                break;
            case 7:
                System.out.println("then it is Saturday");
                break;
            default:
                System.out.println("Invalid day");

        // switch case is comparatively faster than if else if else statements
        // because it directly jumps to the case without checking the condition
        // so whenever you get the chance to use switch case, use it
        
        input.close();
        }
    }
}