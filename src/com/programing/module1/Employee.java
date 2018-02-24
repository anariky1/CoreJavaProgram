package com.programing.module1;

public class Employee {

String name;
int age;
String designation;
double salary;

public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}

public static void main (String[] args){
Employee obj = new Employee();
obj.setAge(25);
System.out.println(obj.getAge());

}


}

