package LearnThisOperator;

public class wheredoweuseThisOperator {	
int id;	

wheredoweuseThisOperator(int id){
this.id=id;	
}

public void display(){
System.out.println("the value of id is: "+id);
}

public static void main(String[] args) {
wheredoweuseThisOperator obj = new wheredoweuseThisOperator(10);
obj.display();	
}	

}