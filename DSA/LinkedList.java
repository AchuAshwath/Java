package DSA;

import java.util.LinkedList;

class JavaLinkedList {
    public static void main(String[] args) {
        // Linked List - nodes are not in continous memeory location
        // advantages = Dynamic data structure (allocates needed memeory while running)
        //              Insertion and deletion O(1)
        //              No/Low memory wastage
        // disadvantages = Greater memory usage (additional pointer)
        //                 no random access of elements (no index[i])        
        //                 Acessing and searching elements O(n)
        // uses = Implements stacks and Queues
        //        GPS navigation
        //        music playlist

        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.push("B");
        myLinkedList.push("A");
        myLinkedList.push("D");
        
        System.out.println(myLinkedList);

        myLinkedList.pop();
        System.out.println(myLinkedList);

        myLinkedList.offer("C");
        myLinkedList.offer("E");

        System.out.println(myLinkedList);

        myLinkedList.poll();
        System.out.println(myLinkedList);

        myLinkedList.addFirst("A");
        System.out.println(myLinkedList);

        myLinkedList.removeLast();
        System.out.println(myLinkedList);

        myLinkedList.addLast("E");
        System.out.println(myLinkedList);

        myLinkedList.add(3, "D");
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.indexOf("C"));
        System.out.println(myLinkedList.peekFirst());
        System.out.println(myLinkedList.peekLast());

        myLinkedList.removeFirst();
        System.out.println(myLinkedList);
    
    }



}
