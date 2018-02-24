package howSuperkeyWordWorks;

public class car extends Vehicle {

int noofgears=5;

car(){
super();
//super("Honda vehicle");
System.out.println("Constructor is valid for cars only");
}

public void noofgears(){
System.out.println("vehicle - no of gears :"+super.noofgears);
System.out.println("car - no of gears : "+this.noofgears);
super.defaultSpeed();
}





public static void main(String[] args) {
car c = new car();
c.noofgears();
defaultSpeed();

}

}


