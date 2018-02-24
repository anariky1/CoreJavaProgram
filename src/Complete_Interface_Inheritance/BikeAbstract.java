package Complete_Interface_Inheritance;

public abstract class BikeAbstract {

abstract void noOfGears();
void maxspeed(){
System.out.println("max speed is 80 kmph");
}

abstract void enginecapabilities();

BikeAbstract(){
System.out.println("Abstract class constructor");
}

public static void main(String[] args) {
System.out.println("A");
}




}

