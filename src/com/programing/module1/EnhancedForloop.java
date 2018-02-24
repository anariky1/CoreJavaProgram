package com.programing.module1;

public class EnhancedForloop {

public static void main(String[] args) {


int [] arr ={1,2,3,4,5};
for(int i: arr){
System.out.println(i);
}


//two dimensional array
int[][]twoArr={{1,2,3,4,5,6},{4,5,6},{7,8,9},{10,11,12}};

for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
System.out.print(twoArr[i][j]+"==");
}
System.out.println();
}
System.out.println("********");
//using advanced for loop
for(int[] arr1 :twoArr){
for(int elm : arr1){
System.out.println(elm);
}
}

}

}


