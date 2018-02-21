
public class TestInheritance1 {

	public static void main(String[] args) {
		
		Person student1 = new Student("Mary", 19, "N00574829", 3.5);
		Person emp1 = new Employee("Bob", 32, "Sales", new Money("$19.99"));
		Person student2 = new Student("Alvin", 22, "N00483954", 2.9);
		
		System.out.println("Name of student 1 is " + student1.getName());
		System.out.println("GPA of student 1 is " + ((Student)student1).getGPA());
		
		int hours = 20;
		System.out.println("Employee 1 will make " + ((Employee)emp1).calcPay(hours) + " in " + hours + "hours");
		
		printinfo(student1);
		printinfo(student2);
		printinfo(emp1);
	}
	
	public static void printinfo(Person mypeep){
		System.out.println("The name of the person is " + mypeep.getName());
		if(mypeep instanceof Student){
			System.out.println("The GPA of the student is " + ((Student)mypeep).getGPA());
		}else{
			System.out.println("The Job ID of the Employee is " + ((Employee)mypeep).getJobid());
		}	
	}
}
