package howConstructorsWork;

public class howConstructorWorks2 {

long start;
long end;

void checkinterval(long start,long end){

if(start>=end){
System.out.println("start should be less than end");
}else{
System.out.println("correct variables");
this.start=start;
this.end=end;
}

}

public static void main(String[] args){

howConstructorWorks2 obj2 = new howConstructorWorks2();	
obj2.checkinterval(10, 20);
System.out.println("Start variable is:" +obj2.start);
System.out.println("Start variable is:" +obj2.end);
}





}

