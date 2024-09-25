package DSA;
import java.util.Stack;
class JavaStack {
    public static void main(String[] args){
        Stack<String> myStack = new Stack<String>();
        System.out.println(myStack.empty());

        // pushing
        myStack.push("Ashwath");
        myStack.push("Anush");
        myStack.push("Malini");
        myStack.push("Null");

        System.out.println(myStack.toString());

        // poping
        myStack.pop();
        System.out.println("Stack after poping "+myStack.toString());

        // searching
        System.out.println(myStack.search("Ashwath"));

        System.out.println(myStack.get(0));

        // peek 
        System.out.println(myStack.peek());

        // empty
        System.out.println(myStack.empty());        // Stack's method
        System.out.println(myStack.isEmpty());      // inherited from the vector class
    }
    
}
