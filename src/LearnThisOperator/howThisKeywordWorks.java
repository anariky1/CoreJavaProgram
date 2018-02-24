package LearnThisOperator;

public class howThisKeywordWorks {

public void display(){	
System.out.println("the value of this operator :"+this);	
}

public static void main(String[] args) {
howThisKeywordWorks obj1 = new howThisKeywordWorks();
System.out.println("the value of object1 is :"+obj1);
obj1.display();

howThisKeywordWorks obj2 = new howThisKeywordWorks();
System.out.println("the value of object1 is :"+obj2);
obj2.display();


}

}
