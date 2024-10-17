package DSA;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

class checkBrackets{
    static boolean CheckBrackets(String inputString){
        Stack<Character> BracketStack = new Stack<>();
        HashMap<Character, Character> respectiveBrackets = new HashMap<>(); 
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

    public static boolean isValid(String s) {
        int i = -1;
         System.out.println("initialising the i value to be -1");
           char[] stack = new char[s.length()];
           for (char ch : s.toCharArray()) {
               if (ch == '(' || ch == '{' || ch == '['){
                   stack[++i] = ch;
                      System.out.println("i value is "+i+"\npushing the value to the stack \n"+Arrays.toString(stack));
               }
               else{
                   if (i >= 0
                            && ((stack[i] == '(' && ch == ')')
                           || (stack[i] == '{' && ch == '}')
                           || (stack[i] == '[' && ch == ']'))){
                               System.out.println("i value is "+i+"\npopping the value from the stack \n"+Arrays.toString(stack));
                               i--;
                           }
                   else
                       return false;
               }
           }
           System.out.println("final i value is "+i);
           return i == -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // try and catch warning
        String inputString;
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

        // System.out.println(b.isValid("()"));
        // System.out.println(b.isValid("()[]{}"));
        // System.out.println(b.isValid("(]"));
        // System.out.println(b.isValid("([)]"));
        System.out.println(isValid("{[]}"));

    }
}
