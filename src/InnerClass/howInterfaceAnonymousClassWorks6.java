package InnerClass;

public class howInterfaceAnonymousClassWorks6 {

public static void main(String[] args) {


InterfaceAnonynousInner_person5 obj = new InterfaceAnonynousInner_person5(){

@Override
public void msg() {	
System.out.println("msg");
}

};

obj.msg();

   }

}
