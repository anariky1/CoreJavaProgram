package com.programing.howinterfaceworks;

public class activa extends bike {

@Override
int nooftyres() {
// TODO Auto-generated method stub
return 0;
}

public static void main(String[] args){

activa obj = new activa();
System.out.println(obj.nooftyres());
obj.run();
obj.splfeature();
System.out.println(obj.i);

// bike b = new bike(); - you cant instantiate an abstract class.


}

void splfeature(){

}


 




}

