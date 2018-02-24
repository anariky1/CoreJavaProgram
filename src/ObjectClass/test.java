package ObjectClass;

public class test {

public static void main(String[] args) {
String s3 = new String("verifying equality");
String s4 = new String("verifying equalities");

if(s3==s4){
System.out.println("== works for strings with same value");
}else{
System.out.println("== doesnt work for strings with same value");
}


if(s3.equals(s4)){
System.out.println("equalsTo works for strings with same value");
}else{
System.out.println("equalsTo works for strings with same value");
}

}

}
