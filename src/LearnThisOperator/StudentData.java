package LearnThisOperator;

public class StudentData {

int id=5;
StudentData(){
int id=10;
System.out.println("the value of id is:"+id);
System.out.println("the value of this id is :" +this.id);

}
public void method1(){
int id=20;
System.out.println("Method 1 - The value of id is :"+id);
System.out.println("Method 1 - The value of this id is :"+this.id);

}
public void method2(int id){	
System.out.println("Method 2 - The value of id is :"+id);
System.out.println("Method 2 - The value of this id is :"+this.id);

}
public void method3(){	
id=11;
System.out.println("Method 2 - The value of id is :"+id);
System.out.println("Method 2 - The value of this id is :"+this.id);

}

public static void main(String[] args) {
StudentData obj = new StudentData();
obj.method1();
obj.method2(10);
obj.method3();

}

}
