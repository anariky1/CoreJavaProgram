package Collections1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String>hset = new HashSet<>();
		
		hset.add("A");
		hset.add("B");
		hset.add("C");
		hset.add("D");
		
		//removing D
		hset.remove("D");
		
	
		
		System.out.println("using iterator....");
		
		Iterator<String>it =  hset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		

	}

}
