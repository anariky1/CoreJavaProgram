package Collections1;


import java.util.LinkedHashSet;

public class howLinkedHashSetWorksWithCustomClass {

	public static void main(String[] args) {
		
		LinkedHashSet<Book>hset = new LinkedHashSet<>();
		Book b1 = new Book(1 ,"A" ,"B" ,"C",10);
		Book b2 = new Book(1 ,"P" ,"Q" ,"R",20);
		Book b3 = new Book(1 ,"X" ,"Y" ,"Z",20);
		
		hset.add(b1);
		hset.add(b2);
		hset.add(b3);
		
		//use iterator
		
		for(Book b : hset){
			System.out.println(b.id +"=="+b.name+"==" + b.author+"==" + b.publisher+"==" + b.quantity);
		}
		
	
		
		

	}


}


