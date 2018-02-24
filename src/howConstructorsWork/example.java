package howConstructorsWork;

public class example {

int age;
String name;
static int c;


private example(int a , int b){
c=2;
}

public static void main(String[] args) {

example ex = new example(5,3);
ex.age=10;
System.out.println(c);

}

}

