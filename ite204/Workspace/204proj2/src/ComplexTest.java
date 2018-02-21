import javax.swing.*;
public class ComplexTest {

	public static void main(String[] args) {
		
		String menu = "y";
		int real;
		int imaginary;
		
		while(!menu.equalsIgnoreCase("n")){
			real = Integer.parseInt(JOptionPane.showInputDialog("Enter the real part of the first complex number: "));
			imaginary = Integer.parseInt(JOptionPane.showInputDialog("Enter the imaginary part of the first complex number: "));
			Complex c1 = new Complex(real, imaginary);
		
			real = Integer.parseInt(JOptionPane.showInputDialog("Enter the real part of the second complex number: "));
			imaginary = Integer.parseInt(JOptionPane.showInputDialog("Enter the imaginary part of the second complex number: "));
			Complex c2 = new Complex(real, imaginary);
		
			JOptionPane.showMessageDialog(null, "You entered " + c1 + " and " + c2 + 
				"\n\nThe sum of these complex numbers is " + c1.add(c2) +
				"\n\nThe difference of these complex numbers is " + c1.subtract(c2) +
				"\n\nThe product of these complex numbers is " + c1.multiply(c2));
			
			menu = JOptionPane.showInputDialog("Would you like to run again?\n\n(y)es\n\n(n)o");
		}
	}

}
