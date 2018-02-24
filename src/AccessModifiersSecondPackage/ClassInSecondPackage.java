package AccessModifiersSecondPackage;

import AccessModifiersFirstPackage.FirstClassInFirstPackage;

public class ClassInSecondPackage extends FirstClassInFirstPackage {

public static void main(String[] args) {
  FirstClassInFirstPackage obj = new FirstClassInFirstPackage();
  System.out.println(obj.data);
  obj.msg();
}


}

