package LearnClone;

public class learnClone implements Cloneable {

int rollno;
String name;

public learnClone(int rollno , String name){

this.rollno=rollno;
this.name=name;
}

public Object clone() throws CloneNotSupportedException{
return super.clone();

}

public static void main(String[] args) {
try {
    learnClone l1=new learnClone(1,"A");	
learnClone l2= (learnClone)l1.clone();
System.out.println(l1.rollno);
System.out.println(l1.name);
System.out.println(l2.rollno);
System.out.println(l2.name);
} catch (CloneNotSupportedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


}

}