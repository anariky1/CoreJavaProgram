package Overriding;

public class cycle extends vehicle {

    @Override()
public void run(){
System.out.println("cycle is running");
}
    
   /* @Override()
    public static void stop(){
    	
    }*/
    
   
    void run1(int a){
    	
    }



public static void main(String[] args) {

cycle c1 = new cycle();
c1.run();
//c1.run(5);

vehicle c2 = new vehicle();
c2.run();


vehicle v3 = new cycle();
v3.run();



}



}
