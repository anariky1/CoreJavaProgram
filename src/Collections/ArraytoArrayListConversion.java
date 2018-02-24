package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArrayListConversion {

	public static void main(String[] args) {
		String arr[]={"A","B","C"};
		ArrayList<String>arrlist = new ArrayList<String>(Arrays.asList(arr));
		
		for(String str:arrlist){
			System.out.println(str);
		}
		
		

	}

}
