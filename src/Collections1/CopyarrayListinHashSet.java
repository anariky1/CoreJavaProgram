package Collections1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CopyarrayListinHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       HashSet<String>hset = new HashSet<>();
		
		hset.add("A");
		hset.add("B");
		hset.add("C");
		hset.add("D");
		
		
		ArrayList<String>arrList = new ArrayList<>();
		arrList.add("X");
		arrList.add("Y");
		arrList.add("Z");
		
		//ADDING arrlist to hashlist
		
		hset.addAll(arrList);
		
		
	   System.out.println("using iterator....");
		
		Iterator<String>it =  hset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		
		
		

	}

}
