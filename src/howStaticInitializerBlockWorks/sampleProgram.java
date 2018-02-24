package howStaticInitializerBlockWorks;

public class sampleProgram {

static int staticvariable;
int nonsstaticvariable;

static{
staticvariable=5;
System.out.println("Static initializer block");
}

{
nonsstaticvariable=3;
System.out.println("Non Static initializer block");
}

sampleProgram(){
System.out.println("Constructor");
}

public static void main(String[] args) {
sampleProgram obj1 = new sampleProgram();
sampleProgram obj2 = new sampleProgram();

}

}


