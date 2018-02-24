package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class howLinkedListworks4_practise {

	public static void main(String[] args) {
		LinkedList<String>linkList1=new LinkedList<String>();
		linkList1.add("Z");
		linkList1.add("Y");
		linkList1.add("A");
		linkList1.add("A");
		linkList1.add("B");
		
		linkList1.addFirst("FIRST");
		linkList1.addLast("LAST");
		
		String varFirst = linkList1.getFirst();
		System.out.println("The first element is : " +varFirst);
		
		
		Object varLast = linkList1.getLast();
		System.out.println("The last element is : " +varLast);
		
		System.out.println("Index of A is : "+linkList1.indexOf("A"));
		
		linkList1.removeFirstOccurrence("A");
		
		System.out.println("After removing first occurance of A:" +linkList1);
		
		
		linkList1.removeLastOccurrence("B");
		linkList1.removeLastOccurrence("");
		
		
		System.out.println("After removing Last occurance of B:" +linkList1);
			
		System.out.println("******using iterator");
		
		Iterator<String>it = linkList1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		System.out.println("******Enhanced for loop");
	
		

		
		
		for(String str:linkList1){			
			System.out.println(str);	
			
		}
		
		
		
		

	}

}
