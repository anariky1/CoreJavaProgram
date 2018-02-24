package howSuperkeyWordWorks;

public class Vehicle {

int noofgears=4;

Vehicle(){
System.out.println("Constructor is valid for all vehicles");
}

Vehicle(String str){
System.out.println("Constructor for: "+str);

}
public static void defaultSpeed(){
System.out.println("The default speed of vehicle");
}

}
