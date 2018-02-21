
public class Complex {
	
	private int real;
	private int imaginary;
	
	Complex(int real, int imaginary){
		
		this.real = real;
		this.imaginary = imaginary;	
	}
	
	Complex(){
		
		this.real = 0;
		this.imaginary = 1;
	}
	
	public int getReal(){
		return this.real;
	}
	
	public int getImaginary(){
		return this.imaginary;
	}
	
	public Complex add(Complex other){
		return new Complex(this.real + other.getReal(), this.imaginary + other.getImaginary());
	}
	
	public Complex subtract(Complex other){
		return new Complex(this.real - other.getReal(), this.imaginary - other.getImaginary());
	}
	
	public Complex multiply(Complex other){
		return new Complex((this.real * other.getReal()) - (this.imaginary * other.getImaginary()), (this.real * other.getImaginary()) + (this.imaginary * other.getReal()));
	}
	
	public String toString(){
		if(this.real == 0){
			return this.imaginary + "i";
		}else if(this.imaginary == 1){
			return this.real + " + " + "i";
		}else if(this.imaginary == 0){
			return this.real + "";
		}else if(this.imaginary < 0){
			return this.real + " - " + Math.abs(this.imaginary) + "i";
		}else{
			return this.real + " + " + this.imaginary + "i";
		}
	}
}
