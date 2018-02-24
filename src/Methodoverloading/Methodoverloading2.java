package Methodoverloading;

public class Methodoverloading2 {

void add(int a,long b){
System.out.println(a+b);
}
void add(int a,int b,int c){
System.out.println(a+b);
}

public static void main(String[] args) {
Methodoverloading2 obj = new Methodoverloading2();  
obj.add(2,3);  //interger will be converted to long

/*void add(int a,long b){   - this will give error .this has both long and int arguments
System.out.println(a+b);
}*/

/*void add(long a,long b){
System.out.println(a+b);
}]*/




}

}
