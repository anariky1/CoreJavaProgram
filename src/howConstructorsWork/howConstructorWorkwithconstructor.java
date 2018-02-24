package howConstructorsWork;

public class howConstructorWorkwithconstructor {

int number;
String name;
int age;
float salary;


howConstructorWorkwithconstructor(int number , String name,int age,float salary){
if(number<0){
System.out.println("number is less than -1");
}else{
System.out.println("number is positive");
}
this.number=number;
this.name=name;
this.age=age;
this.salary=salary;
}

public static void main(String[] args) {

howConstructorWorkwithconstructor obj = new howConstructorWorkwithconstructor(10,"A",25,50000);
System.out.println("Number is :"+obj.number);
System.out.println("Name is :"+obj.name);
System.out.println("age is :"+obj.age);
System.out.println("salary is :"+obj.salary);



}

}
