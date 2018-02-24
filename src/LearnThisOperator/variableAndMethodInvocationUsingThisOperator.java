package LearnThisOperator;

public class variableAndMethodInvocationUsingThisOperator {

public void method1(){
System.out.println("from method 1");
this.method2();	
}

public void method2(){
System.out.println("from method 2");
}

public static void main(String[] args) {
variableAndMethodInvocationUsingThisOperator obj=new variableAndMethodInvocationUsingThisOperator();
obj.method1();


}

}
