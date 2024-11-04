package DSA;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

class JavaPriorityQueue {
    public static void main(String[] args) {
        Queue<Double> justQueue = new LinkedList<>();

        justQueue.offer(4.2);
        justQueue.offer(6.9);
        justQueue.offer(5.0);
        justQueue.offer(3.4);

        while(!justQueue.isEmpty()){
            System.out.println(justQueue.poll());
        }
        System.out.println();

        Queue<Double> ASCpriorityQueue = new PriorityQueue<>();

        ASCpriorityQueue.offer(4.2);
        ASCpriorityQueue.offer(6.9);
        ASCpriorityQueue.offer(5.0);
        ASCpriorityQueue.offer(3.4);

        while(!ASCpriorityQueue.isEmpty()){
            System.out.println(ASCpriorityQueue.poll());
        }
        System.out.println();

        Queue<Double> DSCpriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        DSCpriorityQueue.offer(4.2);
        DSCpriorityQueue.offer(6.9);
        DSCpriorityQueue.offer(5.0);
        DSCpriorityQueue.offer(3.4);

        while(!DSCpriorityQueue.isEmpty()){
            System.out.println(DSCpriorityQueue.poll());
        }

        // Try it with String Object
    }    
}
