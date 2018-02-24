package InnerClass;

class A{

interface msg{
void msg();
}

}


public class InterfacewithinClass11 implements A.msg {

@Override
public void msg() {
System.out.println("Interface with a class");

}


public static void main(String[] args) {

InterfacewithinClass11 obj = new InterfacewithinClass11();
obj.msg();

}

}

