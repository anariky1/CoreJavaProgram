package Collections;

import java.util.ArrayList;
import java.util.List;

public class LetsUseArrayListwithCustomClass3 {
	
	public static void main(String[] args) {
	
	  List<Book>bookList=new ArrayList<>();
	  Book b1=new Book(1,"A","B","C",1);
	  Book b2=new Book(2,"D","E","F",2);
	  Book b3=new Book(3,"G","H","I",3);
	  
	  bookList.add(b1);
	  bookList.add(b2);
	  bookList.add(b3);
	  
	  for(Book b :bookList){
		  System.out.println(b.id+"-"+b.name+"-"+b.author+"-"+b.publisher+"-"+b.quantity+"-");
	  }
	  
	  
	}


}
