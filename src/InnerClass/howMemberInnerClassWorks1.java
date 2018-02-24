package InnerClass;

public class howMemberInnerClassWorks1 {

private int data =5;

public class inner{
public void msg(){
System.out.println("value of variable is: "+data);
}
}

public static void main (String[] args){

howMemberInnerClassWorks1 obj = new howMemberInnerClassWorks1();
howMemberInnerClassWorks1.inner obj2 = obj.new inner();
obj2.msg();


}

}


