package cs520.hw1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		
		String input = JOptionPane.showInputDialog("Enter amount in dollars");
		int hundreds = Integer.parseInt(input);
		
		hundreds = (hundreds - hundreds%100)/100;
		
		JOptionPane.showMessageDialog(f, hundreds);
		
		System.exit(0); 
		
	}

	
}
