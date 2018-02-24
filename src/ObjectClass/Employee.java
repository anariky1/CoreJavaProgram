package ObjectClass;

public class Employee {

String firstName;

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

Employee(String firstName){
this.firstName=firstName;
}

@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result
+ ((firstName == null) ? 0 : firstName.hashCode());
return result;
}

@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Employee other = (Employee) obj;
if (firstName == null) {
if (other.firstName != null)
return false;
} else if (!firstName.equals(other.firstName))
return false;
return true;
}

}
