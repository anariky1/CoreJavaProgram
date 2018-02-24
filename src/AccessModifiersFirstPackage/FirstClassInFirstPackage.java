package AccessModifiersFirstPackage;

public class FirstClassInFirstPackage {	

protected static int data=10;

       protected static void msg(){
System.out.println("Method called from public class");
}

public FirstClassInFirstPackage(){
System.out.println("Constructor invoked in firt class - first package");
}

public static void main(String[] args) {
  FirstClassInFirstPackage obj = new FirstClassInFirstPackage();
  System.out.println(obj.data);
  obj.msg();
}


}

