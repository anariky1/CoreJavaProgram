package Complete_Interface_Inheritance;

//if you dont want to implement all the methods , you can use public abstract class honda extends BikeAbstract
public class Honda extends BikeAbstract {

@Override
void noOfGears() {
System.out.println("Honda has 5 gears");

}

@Override
void enginecapabilities() {
// TODO Auto-generated method stub

}

public static void main(String[] args){
Honda obj = new Honda();
obj.noOfGears();
obj.maxspeed();

}

}
