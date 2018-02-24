package InnerClass;

public class howNestedInterfaceWork9 implements NestedInterfaceexample8.message {

@Override
public void msg() {
System.out.println("inner interface example");	
}

public static void main(String[] args) {
NestedInterfaceexample8.message obj = new howNestedInterfaceWork9();	
obj.msg();
}

}
