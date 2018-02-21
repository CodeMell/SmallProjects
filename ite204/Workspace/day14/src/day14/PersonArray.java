package day14;

public class PersonArray {

	public static void main(String[] args) {
		
		Person[] personarray = new Person[3];
		
		personarray[0] = new Employee("Dale", 22, "IT", new Money("$15.00"));
		personarray[1] = new Student("Michael", 25, "N00488395", 3.85);
		personarray[2] = new Employee("Lauren", 23, "IT", new Money("$32.00"));
		
		for(int i = 0; i < personarray.length; i++){
			System.out.println("Person's name is " + personarray[i].getName());
			
			if(personarray[i] instanceof Student){
				System.out.println("Person is a student");
			}else{
				System.out.println("Person is an employee");
			}
		}

	}

}
