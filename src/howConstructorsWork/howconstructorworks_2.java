package howConstructorsWork;

public class howconstructorworks_2 {
long start;
    long end;



howconstructorworks_2(long start,long end){

if(start>=end){
System.out.println("start should be less than end");
}else{
System.out.println("correct variables");
this.start=start;
this.end=end;
}

}

public static void main(String[] args) {
howconstructorworks_2 obj2= new howconstructorworks_2(20,30);
System.out.println(obj2.start);
System.out.println(obj2.end);


}

}

