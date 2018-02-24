package com.programing.module1;

import java.util.ArrayList;

public class forloopPerformance3 {

static ArrayList<Integer>list=new ArrayList<>();

public static ArrayList<Integer> fun(){
for(int i=0;i<=100_000_00;i++){
list.add(i);
}
return list;
}

public static void main(String[] args) {

ArrayList<Integer>num = fun();
System.out.println(num.size());

for(int i :num){

}


}

}

