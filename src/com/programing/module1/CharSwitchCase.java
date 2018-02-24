package com.programing.module1;

public class CharSwitchCase {

public static void main(String[] args) {
grading('A');
grading('B');
grading('E');
grading('G');
}

public static void grading(char grade){
int success = 0;
switch(grade){
case 'A':
System.out.println("Excellent grade");
success=1;
break;
case 'B':
System.out.println("very good grade");
success=1;
break;
case 'E':
System.out.println("Low grade");
success=0;
break;
default:
System.out.println("Invalid grade");
success=-1;
break;
}
passTheCourse(success);
}

public static void  passTheCourse(int success){

switch(success){
case 1:
System.out.println("Final Result - success");
break;
case 0:
System.out.println("Final Result - fail");
break;
case -1:
System.out.println("Final Result - No result");
break;


}

}

}
