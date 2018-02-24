package Arrays;

import java.util.Arrays;

public class compareArray {

public static void main(String[] args) {

boolean[] b1 = {true,false};
boolean[] b2 = {true,false};

int intArr1[] = {1,2,3};
int intArr2[] = {4,3,6};

if(b1==b2){
System.out.println("== works for Arrays");
}else{
System.out.println("== doesnt work for Arrays");
}

if(intArr1==intArr2){
System.out.println("== works for Arrays");
}else{
System.out.println("== doesnt work for Arrays");
}


System.out.println(Arrays.equals(b1,b2));
System.out.println(Arrays.equals(intArr1,intArr2));

}

}


