import javax.swing.JOptionPane;

public class TestBluray {

	public static void main(String[] args) {
		
		String title = JOptionPane.showInputDialog("Enter Movie Title:");
		String genre = JOptionPane.showInputDialog("Enter Movie Genre:");
		String money = JOptionPane.showInputDialog("Enter Cost:");
		
		Bluray myRay1 = new Bluray(title, genre, new Money(money));
		
		System.out.println(myRay1);

	}

}
