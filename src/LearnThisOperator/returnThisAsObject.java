package LearnThisOperator;

public class returnThisAsObject {

public Object getObject(){
System.out.println(this);
return this;

}

public void message(){
System.out.println("return this object");
}

public void message1(){
System.out.println("return this  message1 object");
}

public static void main(String[] args) {
returnThisAsObject obj=new returnThisAsObject();
obj.getObject();
obj.message();
Object obj1 = obj.getObject();
System.out.println(obj1);
}

}
