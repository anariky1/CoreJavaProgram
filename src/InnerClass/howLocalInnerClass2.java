package InnerClass;

public class howLocalInnerClass2 {

private int data =5;

public void msg(){
class Inner{
public void display(){
System.out.println("the value of data is :" +data);
}	
}

Inner obj = new Inner();
obj.display();



}

public static void main(String[] args) {

howLocalInnerClass2 obj1 = new howLocalInnerClass2();
obj1.msg();	

}
}

