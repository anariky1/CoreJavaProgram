package howConstructorsWork;

public class StudentDataConstructor_arguments {

int id;
String name;
int age;

/*StudentDataConstructor_arguments(){
id=40;
name="ananth";
age = 40;
}*/



StudentDataConstructor_arguments(int id , String name , int age){
this.id=id;
this.name=name;
this.age=age;	
}

StudentDataConstructor_arguments(int id , String name){
this.id=id;
this.name=name;
age=30;	
}

StudentDataConstructor_arguments(int id){
this.id=id;
name="abc";
age=30;	
display();
}

void display(){
System.out.println(id);
System.out.println(name);
System.out.println(age);

}


public static void main(String[] args) {
StudentDataConstructor_arguments obj = new StudentDataConstructor_arguments(10,"xyz",20);

System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj.age);

StudentDataConstructor_arguments obj2 = new StudentDataConstructor_arguments(10,"xyz");

System.out.println(obj2.id);
System.out.println(obj2.name);
System.out.println(obj2.age);

StudentDataConstructor_arguments obj3 = new StudentDataConstructor_arguments(5);

//StudentDataConstructor_arguments obj4 = new StudentDataConstructor_arguments(); - error



}

}

