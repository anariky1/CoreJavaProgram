package ObjectClass;

public class EmployeeClassThatverifiesequalityofCustomClasses {

public static void main(String[] args) {

Employee e1 = new Employee("ABC");
Employee e2 = new Employee("ABC");


/*e1.setFirstName("XYZ");
String e3=e1.getFirstName();
e2.setFirstName("XYZ");
String e4=e2.getFirstName();*/




if(e1.equals(e2)){
System.out.println("e1 equals e2");
}else{
System.out.println("e1 is not equal to e2");
}

System.out.println("Hashcode value of e1 is :"+e1);
System.out.println("Hashcode value of e2 is :"+e2);


//	if(e3.equals(e4)){
//	System.out.println("e3 equals e4");
//	}else{
//	System.out.println("e3 is not equal to e4");
//     }

}

}
