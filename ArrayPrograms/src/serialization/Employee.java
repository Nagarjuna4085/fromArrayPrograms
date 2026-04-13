package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	String name;
	int age;

	public Employee(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("john doe", 26);

		try {
//			serialization

//			FileOutputStream fos = new FileOutputStream("emp.ser");
//			ObjectOutputStream ous = new ObjectOutputStream(fos);
//			ous.writeObject(emp1);
//			ous.close();
//			fos.close();
//            System.out.println("Object Serialized");
//            
            //de serialization
            
            FileInputStream fis = new FileInputStream("emp.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
           Employee emp = (Employee) ois.readObject();
           
           ois.close();
           fis.close();

           System.out.println(emp.age + " " + emp.name);
           
            

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
