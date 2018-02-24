package LearnThisOperator;

public class Student2 {

Student2(){	
System.out.println("No values");
}

Student2(String str){
this();
System.out.println("The value of str is :"+str);
}

public static void main(String[] args) {
    Student1 obj = new Student1("constructor with values");

}

}
