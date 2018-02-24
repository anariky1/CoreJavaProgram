package Collections;

import java.util.LinkedList;

public class LinkedTest {

public static void main(String[] args) {
LinkedList<String> linkedlist = new LinkedList<String>();

linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");
        
        System.out.println("Linked List Content: " +linkedlist);
        
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " +linkedlist);
        
        String firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Changed first item");
        String firstvar2 = linkedlist.get(0);
        System.out.println("First element: " +firstvar2);
        
        linkedlist.removeFirst();
        linkedlist.removeLast();
        
        System.out.println("Linked List Content: " +linkedlist);
        
        linkedlist.add(0, "Newly added item");
        
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist); 
        
        
        System.out.println(linkedlist.contains("Item10"));
        
        
        
       
        
        
        
        
        // Manipulation with ArrayList is slow because it internally uses array. If any element is removed from the array, all the bits are shifted in memory.
        
       // Manipulation with LinkedList is faster than ArrayList because it uses doubly linked list so no bit shifting is required in memory.
        
        //ArrayList is better for storing and accessing data.
        
        //LinkedList is better for manipulating data.
        
        //http://beginnersbook.com/2013/12/linkedlist-in-java-with-example/
        //https://www.tutorialspoint.com/java/java_linkedlist_class.htm
        //http://www.javatpoint.com/difference-between-arraylist-and-linkedlist
        
        
        

}

}
