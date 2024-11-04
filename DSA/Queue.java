package DSA;
import java.util.LinkedList;
import java.util.Queue;

class JavaQueue{
    public static void main(String[] args) {
        // Queue<String> myQueue = new Queue<String>();
        // Queue is an interface, so we cannot instantiate a interface 
        // we can only use it on a class, Linked List and priority Queue  
        // use the Queue interface 
        // Queue extends collection class

        Queue<String> myQueue = new LinkedList<>();
        //          Throws exception	Returns special value
        // Insert	add(e)	            offer(e)
        // Remove	remove()	        poll()
        // Examine	element()	        peek()

        System.out.println(myQueue.isEmpty());

        myQueue.offer("Karen");
        myQueue.offer("Chad");
        myQueue.offer("Steve");
        myQueue.offer("Harold");

        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        
        myQueue.poll();

        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);
        System.out.println(myQueue.isEmpty());

        System.out.println(myQueue.size());
        System.out.println(myQueue.contains("Harold"));

        //used in Breadth-first search
    
    }
}