package com.programing.module1;

import java.util.ArrayList;
import java.util.Calendar;

public class forloopperf2 {


static ArrayList<Integer>list=new ArrayList<>();
static Long StartTime;
static Long EndTime;

static{
for(int i=0;i<=100_000_00;i++){
list.add(i);
}

}

public static void main(String[] args) {

//enhanced for loop

StartTime = Calendar.getInstance().getTimeInMillis();
for(int i : list){

}
EndTime = Calendar.getInstance().getTimeInMillis();
System.out.println(" time diff for enhanced for loop:" + (EndTime-StartTime));


//regular for loop

StartTime = Calendar.getInstance().getTimeInMillis();
for(int i=0;i<=list.size();i++){

}
EndTime = Calendar.getInstance().getTimeInMillis();
System.out.println(" time diff for normal for loop:" + (EndTime-StartTime));


//taking  size before the loop
int size=list.size();
StartTime = Calendar.getInstance().getTimeInMillis();

       for(int i=0;i<=size;i++){

}
EndTime = Calendar.getInstance().getTimeInMillis();
System.out.println(" time diff for normal for loop - size taken prior:" + (EndTime-StartTime));


}

}

