package howConstructorsWork;

public class howConstructorWork {

int number;

void setNumber(int number){
if(number<0){
System.out.println("number is less than -1");
}
this.number=number;
}

public static void main(String[] args){
howConstructorWork obj = new howConstructorWork();
obj.setNumber(-1);

}

}


