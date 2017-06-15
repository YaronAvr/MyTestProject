package exercises;

public class PassByValueOnlyInJava {

	public PassByValueOnlyInJava() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee(1);
		Employee employee2 = new Employee(2);
		
		System.out.println(employee1);
		System.out.println(employee2);
		Integer id = new Integer(6);
		swap(employee1,employee2,id);
		
		System.out.println(employee1);
		System.out.println(employee2);
		
		System.out.println(employee1.id);
		System.out.println(employee2.id);
		System.out.println(id);
	}

	private static void swap(Employee employee1, Employee employee2,Integer id) {
		// TODO Auto-generated method stub
		
		System.out.println(employee1);
		System.out.println(employee2);
		id += 3;
		Employee employee3 = employee1;
		employee1 = null;
		employee2 = null;
		
		//employee1.id = 3;
		//employee2.id = 4;
		
		System.out.println(employee1);
		System.out.println(employee2);
	}


}
class Employee {

	int id;
	public Employee(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

}