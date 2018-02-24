package LearnThisOperator;

public class variableInvocationUsingVariableMethod {

int id;
String name;

variableInvocationUsingVariableMethod(){
System.out.println("no variables");
}

variableInvocationUsingVariableMethod(int id,String name){
this();
this.id=id;
this.name=name;
System.out.println(id+"=="+name);
}


public static void main(String[] args) {
variableInvocationUsingVariableMethod obj = new variableInvocationUsingVariableMethod();
variableInvocationUsingVariableMethod obj1 = new variableInvocationUsingVariableMethod(2,"ananth");


}

}