package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class howArrayListworks1 {

	public static void main(String[] args) {
		List<String>arrList1=new ArrayList<String>();
		arrList1.add("Z");
		arrList1.add("Y");
		arrList1.add("A");
		
		List<String>arrList2=new ArrayList();
		arrList2.add("V");
		arrList2.add("P");
		arrList2.add("Q");
		
		
		
		arrList1.addAll(arrList2);
		arrList1.remove("A");
		//arrList1.removeAll(arrList2);
		
		
		System.out.println("******using iterator");
		Iterator<String>it = arrList1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		System.out.println("******Enhanced for loop");
		
		arrList1.set(1, "replace the existing element");
		
		//arrList1.clear();
		
		arrList1.retainAll(arrList2);
		
		
		for(String str:arrList1){			
			System.out.println(str);	
			
		}
		
		

	}

}
