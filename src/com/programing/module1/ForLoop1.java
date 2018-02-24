package com.programing.module1;

public class ForLoop1 {

public static void main(String[] args) {
// TODO Auto-generated method stub

for(int i=1;i<=10;i++){
System.out.println(i);

}

System.out.println("Fibinocci series");

for(int i=0,j=1;i<=50;i=i+j,j=i-j){
System.out.println(i);
}

System.out.println("All time trues");
for(int i=0;i<=5;){
System.out.println("All the time true"+i);	
}

/*for(;;){
System.out.println("All the time true");	
}*/

}

}

