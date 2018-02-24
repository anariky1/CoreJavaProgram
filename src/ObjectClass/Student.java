package ObjectClass;

public class Student {


public static void main(String[] args) {

String s1 = "verifying equality";
String s2 = "verifying equality";


if(s1==s2){
System.out.println("== works for strings with same value");
}else{
System.out.println("== doesnt work for strings with same value");
}

if(s1.equals(s2)){
System.out.println("equalsTo works for strings with same value");
}else{
System.out.println("equalsTo works for strings with same value");
}

System.out.println("******************");

String s3 = new String("verifying equality");
String s4 = new String("verifying equality");

if(s3==s4){
System.out.println("== works for strings with same value");
}else{
System.out.println("== doesnt work for strings with same value");
}

if(s1.equals(s2)){
System.out.println("equalsTo works for strings with same value");
}else{
System.out.println("equalsTo works for strings with same value");
}




}

}
