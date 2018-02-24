package instanceKeyWord;



public class AnotherExampleOfInstance {

public static void main(String[] args) {

Parent parent = new Parent();
System.out.println(parent instanceof Parent);
System.out.println(parent instanceof Child1);
System.out.println(parent instanceof Child2);

System.out.println("*******");

Child1 c1 = new Child1();
System.out.println(c1 instanceof Parent);
System.out.println(c1 instanceof Child1);
//System.out.println(c1 instanceof Child2);

System.out.println("*******");

Child2 c2 = new Child2();
System.out.println(c2 instanceof Parent);
//System.out.println(c2 instanceof Child1);
System.out.println(c2 instanceof Child2);

System.out.println("*******");

Parent p1 = new Child1();
System.out.println(p1 instanceof Parent);
System.out.println(p1 instanceof Child1);
System.out.println(p1 instanceof Child2);





}

}

