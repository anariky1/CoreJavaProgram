
package howStatickeywordWorks;

public class WhichMethodareMadetobeStatic {

static int add(int firstno , int secno){
return firstno+secno;
}

public static void main(String[] args) {
int result=WhichMethodareMadetobeStatic.add(3, 2);
System.out.println(result);
int result2=Math.min(1, 2);
System.out.println(result2);
}

}

