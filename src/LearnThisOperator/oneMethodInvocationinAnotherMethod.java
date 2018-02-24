package LearnThisOperator;

public class oneMethodInvocationinAnotherMethod {

int i;
public void method1(){
method2(this);

}

public void method2(oneMethodInvocationinAnotherMethod obj){
System.out.println(obj.i);

}

public static void main(String[] args) {
oneMethodInvocationinAnotherMethod obj = new oneMethodInvocationinAnotherMethod();
obj.method1();

}

}
