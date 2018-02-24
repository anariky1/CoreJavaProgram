package LearnThisOperator;

public class Student1 {

Student1(){
this("new student");
System.out.println("No values");
}

Student1(String str){

System.out.println("The value of str is :"+str);
}

public static void main(String[] args) {
Student1 obj = new Student1();
}

}
