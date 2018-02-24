package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface2 {

	public static void main(String[] args) {
		List<String>arrList=new ArrayList();
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");
		
		
		arrList.add(null);
		arrList.add(null);
		arrList.add(null);
		
		arrList.add("B");
		arrList.add("C");
		arrList.add("D");
		
		Iterator<String>it = arrList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		

	}

}
