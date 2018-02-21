package day03;
import javax.swing.*;

public class MathMenu {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num2"));
		String msg;

		String menuchoice = showMenu();

		while(menuchoice.equalsIgnoreCase("q") == false){

			if(menuchoice.equalsIgnoreCase("a")){

				int sum = num1 + num2;
				msg = "The result is: \n" + sum;

			}else if(menuchoice.equalsIgnoreCase("v")){

				double avg = (num1 + num2) / 2.0;
				msg = "The result is: \n" + avg;

			}else{
				msg = "Invalid Input";
			}

			JOptionPane.showMessageDialog(null, msg );
			menuchoice = showMenu();
		}


	}

	public static String showMenu(){
		String menumsg = "Please choose an option\n\n";
		menumsg += "(a)dd numbers\n";
		menumsg += "a(v)erage numbers\n";
		menumsg += "(q)uit\n\n";

		return JOptionPane.showInputDialog(menumsg);

	}

}
