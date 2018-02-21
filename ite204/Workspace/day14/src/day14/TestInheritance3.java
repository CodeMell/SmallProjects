package day14;

public class TestInheritance3 {

	public static void main(String[] args) {
		
		Person p1 = new Person("Cassandra", 25);
		Student s1 = new Student("Steven", 24, "N00546892", 3.95);
		Employee e1 = new Employee("Jesse", 27, "Payroll", new Money("$45.95"));
		
		System.out.println(p1);
		System.out.println(s1);
		System.out.println(e1);

	}

}
