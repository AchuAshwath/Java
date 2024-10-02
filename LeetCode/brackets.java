package LeetCode;
import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;

class checkBrackets{
    static boolean CheckBrackets(String inputString){
        Stack<Character> BracketStack = new Stack<Character>();
        HashMap<Character, Character> respectiveBrackets = new HashMap<Character, Character>(); 
        respectiveBrackets.put(')', '(');
        respectiveBrackets.put('}', '{');
        respectiveBrackets.put(']', '[');

        System.out.println("the string is "+ inputString);
        // BracketStack.push(inputString.charAt(0));
        for(int i = 0; i < inputString.length(); i++){
            System.out.println("interation number "+i +" with "+ inputString.charAt(i) ) ;
            if(BracketStack.isEmpty()){
                BracketStack.push(inputString.charAt(i));
                System.out.println("pushing the string to the stack \n"+BracketStack);
            }else if(respectiveBrackets.get(inputString.charAt(i)) == BracketStack.peek()){
                System.out.println("the current character : "+inputString.charAt(i));
                System.out.println("the respective character for "+inputString.charAt(i)+ " is "+respectiveBrackets.get(inputString.charAt(i)));
                System.err.println("the last character pushed into the stack : "+BracketStack.peek());
                // System.out.println(respectiveBrackets.get(inputString.charAt(i)) == BracketStack.peek());
                System.out.println("before poping : "+BracketStack.toString());
                System.out.println("poping the value :"+BracketStack.pop());
                System.out.println("after poping : "+BracketStack.toString());
            }else{
                System.out.println("no matching bracket found in stack to pop \nchecking if the bracket is open or close before pushing");
                if(inputString.charAt(i) == ']' || inputString.charAt(i) == '}'|| inputString.charAt(i) == ')'){
                    System.out.println("closing bracket found is not in compliance with the order of the stack : "+ inputString.charAt(i));
                    System.out.println(BracketStack.toString());
                    return false;
                }else{                    
                    BracketStack.push(inputString.charAt(i));
                    System.out.println(BracketStack);
                }

            }
        }
        if(!BracketStack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = new String();
        System.out.println("Can you enter the string of Brackets to compare : ");
        inputString = input.next();
        // inputString = "(])";
        boolean result = CheckBrackets(inputString);
        if(result){
            System.out.println(" the given brackets are properly closed and in order");
        }else{
            System.out.println("the given brackets are not properly closed and not in order");
        }
        input.close();

    }
}