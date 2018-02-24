package howStatickeywordWorks;

public class StudentData {

int rollno;
String name;
static String collegeName = "SVCET";

StudentData(int rollno , String name){
this.rollno=rollno;
this.name=name;
System.out.println(rollno+" "+name+" "+collegeName);
display();

}

void display(){
System.out.println(rollno+"--"+name+"--"+collegeName);

}


static void change(){
collegeName="SVCE";


}


public static void main(String[] args) {
StudentData.change();
StudentData s1 = new StudentData(1,"a");
StudentData s2 = new StudentData(1,"b");
collegeName = "Hindustan";
StudentData s3 = new StudentData(1,"c");
StudentData s4 = new StudentData(1,"d");
s1 = new StudentData(1,"a");




}

}


