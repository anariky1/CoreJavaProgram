package Complete_Interface_Inheritance;

public class NIT implements ICollege {

@Override
public void students() {
System.out.println("Students Information");

}

@Override
public void extraCurricularActivities() {
// TODO Auto-generated method stub

}

@Override
public void semniars() {
// TODO Auto-generated method stub

}

@Override
public void studentGroups() {
// TODO Auto-generated method stub

}

public static void main(String[] args){
NIT obj = new NIT();
obj.students();
System.out.println(obj.var);

ICollege obj2 = new NIT();
obj2.students();



    //ICollege obj2 = new ICollege(); - error - cannot instantiate interface***********


}

@Override
public void collegeRules() {
// TODO Auto-generated method stub

}

@Override
public void collegeCurriculum() {
// TODO Auto-generated method stub

}

@Override
public void collegeRanking() {
// TODO Auto-generated method stub

}

@Override
public void collegeBackground() {
// TODO Auto-generated method stub

}

}

