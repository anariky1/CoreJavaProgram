package TypeCasting;

public class HowTypeCastingWorks {

public static void main(String[] args) {

Machine machine = new Machine();
machine.start();


Camera camera = new Camera();
camera.start();
camera.snap();

//upcasting
Machine machine2 = new Camera();
machine2.start();

//downcasting
Machine machine3 = new Camera();	
Camera camera1 = (Camera)machine3;
camera1.start1();
camera1.snap();
camera1.start();

}

}
