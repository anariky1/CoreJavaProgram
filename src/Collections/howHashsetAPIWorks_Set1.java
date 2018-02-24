package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class howHashsetAPIWorks_Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String>hset = new HashSet<>();
		
		hset.add("ABC");
		hset.add("ABC");
		hset.add("ABC");
		hset.add(null);
		hset.add(null);
		hset.add(null);
		hset.add("A");
		hset.add("B");
		hset.add("C");
		
		
		System.out.println("Using Iterator");
		
		Iterator<String>it= hset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("Using Enhanced for loop");
		
		for(String s :hset ){
			System.out.println(s);
		}
		
		
		

	}

}
