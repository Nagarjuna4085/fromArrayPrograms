package equalshashcode;

import java.util.Objects;

public class Employee {
	int id;
	String name;

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;

		if (e.id == this.id && e.name.equals(this.name)) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name);
	}
	
	
	

}
