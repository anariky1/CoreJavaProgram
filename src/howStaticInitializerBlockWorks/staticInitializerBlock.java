package howStaticInitializerBlockWorks;

public class staticInitializerBlock {

// static initializer block
static{
System.out.println("Static initializer block");
}
//non static initializer block

{
System.out.println("non Static initializer block");
}

public static void main(String[] args){
staticInitializerBlock obj1=new staticInitializerBlock();
staticInitializerBlock obj2=new staticInitializerBlock();

}
}
