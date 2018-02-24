package howStatickeywordWorks;

public class StaticKeyword {
int count=0;

StaticKeyword(){
count++;
System.out.println(count);
}

public static void main(String[] args) {

StaticKeyword obj1 = new StaticKeyword();
StaticKeyword obj2 = new StaticKeyword();
StaticKeyword obj3 = new StaticKeyword();


}

}



