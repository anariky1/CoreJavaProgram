package InnerClass;

public  class howStaticNestedClasswork7 {

static int data=10;

public static class staticNestedClassExample{
static void msg(){
System.out.println("in message");
 
}
 
}
 
public static void main (String[] args){
howStaticNestedClasswork7.staticNestedClassExample obj = new howStaticNestedClasswork7.staticNestedClassExample();
obj.msg();
//staticNestedClassExample.msg();
 
}

}
