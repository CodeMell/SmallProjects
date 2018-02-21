
public class Student extends Person {
	
	private String nnum;
	private double gpa;
	
	public Student(String name, int age, String nnum, double gpa){
		super(name, age);
		this.nnum = nnum;
		this.gpa = gpa;
	}
	
	public Student(){
		super();
		this.nnum = "N000000";
		this.gpa = 0.0;
	}
	
	public String getNNum(){
		return this.nnum;
	}
	
	public double getGPA(){
		return this.gpa;
	}
	
	public boolean isEqual(Student s){
		if(super.isEqual(s) && this.nnum == s.getNNum() && this.gpa == s.getGPA()){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return super.toString() + 
				"\nN Number: " + this.nnum +
				"\nGPA: " + this.gpa;
	}
}
