package day14;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(){
		this("John Doe", 0);
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public boolean isEqual(Person p){
		if(this.age == p.getAge() && this.name == p.getName()){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		String msg = "Name: " + this.name;
		
		if(this instanceof Student){
			msg += "\nType: Student";
		}else if(this instanceof Employee){
			msg += "\nType: Employee";
		}else{
			msg += "\nType: Person";
		}
		msg += "\nAge: " + this.age;
		return msg;
	}
}
