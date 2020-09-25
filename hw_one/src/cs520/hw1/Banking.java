package cs520.hw1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		
		String input = JOptionPane.showInputDialog("Enter amount in dollars");
		int amount = Integer.parseInt(input);
		System.out.println("Requested Amount = " + amount);
		
		int hundreds, fifties, twenties, tens, fives, twos, ones;
		int remainingAmount;
		remainingAmount = amount%100;
		hundreds = (amount - remainingAmount)/100;
		System.out.println("Hundreds = " + hundreds + ", RemainingAmount = " + remainingAmount);
				
		remainingAmount = amount%50;
		fifties = (amount - remainingAmount)/50;
		System.out.println("Fifties = " + fifties + ", RemainingAmount = " + remainingAmount);
				
		remainingAmount = amount%20;
		twenties = (amount - remainingAmount)/20;
		System.out.println("Twenties = " + twenties + ", RemainingAmount = " + remainingAmount);
				
		remainingAmount = amount%10;
		tens = (amount - remainingAmount)/10;
		System.out.println("Tens = " + tens + ", RemainingAmount = " + remainingAmount);
				
		remainingAmount = amount%5;
		fives = (amount - remainingAmount)/5;
		System.out.println("Fives = " + fives + ", RemainingAmount = " + remainingAmount);
				
		remainingAmount = amount%2;
		twos = (amount - remainingAmount)/2;
		System.out.println("Twos = " + twos + ", RemainingAmount = " + remainingAmount);
				
		remainingAmount = amount%1;
		ones = (amount - remainingAmount)/1;
		System.out.println("Ones = " + ones + ", RemainingAmount = " + remainingAmount);
				
		JOptionPane.showMessageDialog(f, "Hundreds=" + hundreds + "\nFifties=" + fifties + "\nTwenties=" + twenties + "\nTens=" + tens + "\nFives="+fives+"\nTwos=" + twos + "\nOnes="+ones);
		
		System.exit(0); 
		
	}

	
}
