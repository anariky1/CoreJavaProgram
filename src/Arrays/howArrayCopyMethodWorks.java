package Arrays;

public class howArrayCopyMethodWorks {

public static void main(String[] args) {

char[] copyFrom= {'a','b','c','d','e'};
char[] copyTo= new char[7];
System.arraycopy(copyFrom, 1, copyTo, 0, 3);
System.out.println(copyTo);	

}

}

