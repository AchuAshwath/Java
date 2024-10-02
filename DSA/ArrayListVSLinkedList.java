package DSA;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {
    public static void main(String args[]){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arralyList =  new ArrayList<Integer>();

        long startTime, endTime, elapsedTime;
        
        System.out.println("initialising and inserting both array list and linked list with 1 million integers");
        for(int i = 0; i< 1000000; i++){
            linkedList.add(i);
            arralyList.add(i);
        }

        // getting first index

        startTime = System.nanoTime();
        linkedList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList get first index\ntime taken : "+ elapsedTime+ " ns");
        
        startTime = System.nanoTime();
        arralyList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList get first index\ntime taken : "+ elapsedTime+ " ns");

        // geting middle index

        startTime = System.nanoTime();
        linkedList.get(499999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList get middle index\ntime taken : "+ elapsedTime+ " ns");

        startTime = System.nanoTime();
        arralyList.get(499999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList get middle index\ntime taken : "+ elapsedTime+ " ns");

        // geting last index

        startTime = System.nanoTime();
        linkedList.get(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList get last index\ntime taken : "+ elapsedTime+ " ns"); // faster because of doubly linked list

        startTime = System.nanoTime();
        arralyList.get(99999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList get last index\ntime taken : "+ elapsedTime+ " ns");

        // removing first index

        startTime = System.nanoTime();
        linkedList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList remove first index\ntime taken : "+ elapsedTime+ " ns");
        
        startTime = System.nanoTime();
        arralyList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList remove first index\ntime taken : "+ elapsedTime+ " ns");

        // removing middle index

        startTime = System.nanoTime();
        linkedList.remove(499998);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList remove middle index\ntime taken : "+ elapsedTime+ " ns");

        startTime = System.nanoTime();
        arralyList.remove(499998);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList remove middle index\ntime taken : "+ elapsedTime+ " ns");

        // removing last index

        startTime = System.nanoTime();
        linkedList.remove(999997);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList remove last index\ntime taken : "+ elapsedTime+ " ns"); // faster because of doubly linked list

        startTime = System.nanoTime();
        arralyList.remove(99997);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList remove last index\ntime taken : "+ elapsedTime+ " ns");

        

    }
    
}
