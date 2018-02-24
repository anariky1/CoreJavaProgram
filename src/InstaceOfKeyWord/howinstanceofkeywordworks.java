package InstaceOfKeyWord;



public class howinstanceofkeywordworks {

public static void main(String[] args) {

Vehicle vehicle = new Vehicle();
System.out.println(vehicle instanceof Vehicle);
System.out.println(vehicle instanceof DriveCar);
System.out.println(vehicle instanceof Car);
System.out.println(vehicle instanceof Bike);

System.out.println("**********");

Car car = new Car();
System.out.println(car instanceof Vehicle);
System.out.println(car instanceof DriveCar);
System.out.println(car instanceof Car);
//System.out.println(car instanceof Bike);

System.out.println("**********");

Bike bike = new Bike();
System.out.println(bike instanceof Vehicle);
System.out.println(bike instanceof DriveCar);
//System.out.println(bike instanceof Car);
System.out.println(bike instanceof Bike);







}

}


