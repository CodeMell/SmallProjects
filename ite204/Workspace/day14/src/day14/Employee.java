package day14;

public class Employee extends Person{
	
	private String jobid;
	private Money payrate;
	
	public Employee(String name, int age, String jobid, Money payrate){
		super(name, age);
		this.jobid = jobid;
		this.payrate = payrate;
	}
	
	public Employee(){
		super();
		this.jobid = "None";
		this.payrate = new Money();
	}
	
	public String getJobid(){
		return this.jobid;
	}
	
	public Money getPayRate(){
		return this.payrate;
	}
	
	public boolean isEqual(Employee e){
		if(super.isEqual(e) && this.jobid == e.getJobid() && this.payrate.compare(e.getPayRate()) == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public Money calcPay(int hours){
		return this.payrate.multiply(hours);
	}
	
	public String toString(){
		return super.toString() + "\nJobID: " + this.jobid + "\nPayrate: " + this.payrate;
	}
}
