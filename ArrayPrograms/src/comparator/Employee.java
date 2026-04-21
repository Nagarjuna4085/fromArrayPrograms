package comparator;


public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Employee e) {

		if (this.getId() > e.id) {
			return 1;
		} else if (this.getId() == e.id) {
			return 0;
		} else {
			return -1;
		}

	}

}
