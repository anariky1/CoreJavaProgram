package howConstructorsWork;

public class StudentDataConstructor_Noarguments {

int id;
String name;
int age;

StudentDataConstructor_Noarguments(){
id =10;
name="xyz";
age = 26;

}




public static void main(String[] args) {
StudentDataConstructor_Noarguments obj = new StudentDataConstructor_Noarguments();

System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj.age);


}

}

