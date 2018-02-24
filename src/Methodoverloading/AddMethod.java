package Methodoverloading;

public class AddMethod {

public static void main(String[] args) {
AddMethod obj =new  AddMethod();
int sum=obj.add(1,2);
System.out.println(sum);
int sum1=obj.add(1,2,3);
System.out.println(sum1);

}

public int add (int a,int b){
int sum= a+b;	
return sum;

}

public int add (int a,int b,int c){
int sum1= a+b+c;	
return sum1;

}

}
