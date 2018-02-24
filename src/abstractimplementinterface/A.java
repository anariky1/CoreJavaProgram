package abstractimplementinterface;

public interface A {

void a();
void b();
void c();
void d();
}

  abstract class B implements A{
  public void a(){
  System.out.println("A method implemention");
  }
 
  public abstract void f();
  public abstract void g();
  public void h() {
  System.out.println("h");
}

}


