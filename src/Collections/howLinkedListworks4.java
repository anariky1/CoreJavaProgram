package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class howLinkedListworks4 {

	public static void main(String[] args) {
		LinkedList<String>linkList1=new LinkedList<String>();
		linkList1.add("Z");
		linkList1.add("Y");
		linkList1.add("A");
		
		linkList1.addFirst("FIRST");
		linkList1.addLast("LAST");
		
		Object varFirst = linkList1.getFirst();
		System.out.println("The first element is : " +varFirst);
		
		
		Object varLast = linkList1.getLast();
		System.out.println("The last element is : " +varLast);
		

		
		
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
