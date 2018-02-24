package InnerClass;

public class HowAbstractAnonymousInnerClassWorks4 {

public static void main(String[] args) {

//anonymous inner class
AbstractanaonymousInner_person3 obj = new AbstractanaonymousInner_person3(){

@Override()
public void name() {
System.out.println("abstract methods");	
}

};

obj.name();


}

}
