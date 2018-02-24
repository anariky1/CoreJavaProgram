package Arrays;

public class howToPassArrayToMethod {

public static void main(String[] args) {
int intArr[]= {5,3,1,2,4};
min(intArr);
}

private static void min(int[] intArr) {
int min=intArr[0];
for(int i=1;i<intArr.length;i++){
if(min>intArr[i]){
min=intArr[i];	
}
}
System.out.println("The minimum value is : "+min);

}

}

