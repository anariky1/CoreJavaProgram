package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class exampleforsetandnextintforlistiterator6 {

	public static void main(String[] args) {
        ArrayList<String> listObject = new ArrayList<>();
		
		listObject.add("A");
		listObject.add("B");
		listObject.add("C");
		
		ListIterator<String>it= listObject.listIterator();
		
		System.out.println(" initial index :"+it.nextIndex());
		System.out.println("In forward direction");
		
		while(it.hasNext()){
			System.out.println(it.next());
			System.out.println(" Next index:"+it.nextIndex());
			it.set("AAA");
		}
		
		
		
		System.out.println("In background direction");
		
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
		
		

	}

}
