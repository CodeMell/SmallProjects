import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonDemo extends JFrame implements ActionListener {
	
	JButton incbutton, decbutton;
	JLabel numlabel;
	int number = 0;
	
	public static void main(String[] args) {
		
		ButtonDemo myframe = new ButtonDemo();
		myframe.setSize(250, 350);
		myframe.setTitle("BUTTONS");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setLocationRelativeTo(null);
		myframe.setResizable(true);
		myframe.setVisible(true);
	}
	
	public ButtonDemo(){
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.blue);
		
		JLabel title = new JLabel("Click a Button");
		title.setForeground(Color.white);
		title.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		c.add(title);
		
		incbutton = new JButton("Increment");
		c.add(incbutton);
		incbutton.addActionListener(this);
		
		decbutton = new JButton("Decrement");
		c.add(decbutton);
		decbutton.addActionListener(this);
		
		numlabel = new JLabel(number + "");
		numlabel.setFont(new Font("Comic Sans MS", Font.BOLD, 200));
		numlabel.setForeground(Color.yellow);
		c.add(numlabel);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == incbutton){
			number++;
		}else{
			number--;
		}
		numlabel.setText(number + "");
		if(number % 2 == 0){
			numlabel.setForeground(Color.green);
		}else{
			numlabel.setForeground(Color.red);
		}
	}

}
