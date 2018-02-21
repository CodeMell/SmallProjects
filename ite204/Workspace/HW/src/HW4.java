import javax.swing.*;

public class HW4 {

	public static void main(String[] args) {
		
		String msg = "";
		boolean found = false;
		int[] nums = new int[10];

		for(int i = 0; i < nums.length; i++){
			nums[i] = (int)((Math.random() * 100) + 1);
		}
		
		int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number 1 - 100"));
		
		for(int i = 0; i < nums.length; i++){
			if(guess == nums[i]){
				msg += guess + " is found at position " + i + "\n"; 
				found = true;
			}
		}
		
		if(!found){
			msg += "Your guess was not found anywhere in the array.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
