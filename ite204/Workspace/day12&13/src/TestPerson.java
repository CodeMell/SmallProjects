
public class TestPerson {

	public static void main(String[] args) {
		Person jim = new Person("Jimmy", 26);
		System.out.println(jim);
		Person tom = new Person("Jimmy", 26);
		System.out.println(tom);
		if(jim.isEqual(tom)){
			System.out.println("The people are the same");
		}else{
			System.out.println("The people are not the same");
		}
		
		Student s1 = new Student("John", 22, "N000453", 4.0);
		Student s2 = new Student("Bob", 21, "N937298", 3.2);
		
		if(s1.isEqual(s2)){
			System.out.println("Students are equal");
		}else{
			System.out.println("Students are not equal");
		}
		
		System.out.println(s1);
	}

}
