package cs520.hw1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		
		//getting string input from user
		String input = JOptionPane.showInputDialog("Enter amount in dollars");
		int amount = Integer.parseInt(input);
		System.out.println("Requested Amount = " + amount);
		
		//declaring all integers needed for the program
		int hundreds, fifties, twenties, tens, fives, twos, ones;
		int remainingAmount=0;
		
		//calculating number of hundreds in the amount
		hundreds = (amount - remainingAmount)/100;
		//calculating remainder of division by 100
		remainingAmount = amount%100;
		
		//Printing out to console number of hundreds and remainder
		System.out.println("Hundreds = " + hundreds + ", RemainingAmount = " + remainingAmount);
		
		fifties = remainingAmount/50;
		remainingAmount = remainingAmount%50;
		System.out.println("Fifties = " + fifties + ", RemainingAmount = " + remainingAmount);
				
		twenties = remainingAmount/20;
		remainingAmount = remainingAmount%20;
		System.out.println("Twenties = " + twenties + ", RemainingAmount = " + remainingAmount);
				
		tens = remainingAmount/10;
		remainingAmount = remainingAmount%10;
		System.out.println("Tens = " + tens + ", RemainingAmount = " + remainingAmount);
				
		fives = remainingAmount/5;
		remainingAmount = remainingAmount%5;
		System.out.println("Fives = " + fives + ", RemainingAmount = " + remainingAmount);
				
		twos = remainingAmount/2;
		remainingAmount = remainingAmount%2;
		System.out.println("Twos = " + twos + ", RemainingAmount = " + remainingAmount);
				
		ones = remainingAmount/1;
		remainingAmount = remainingAmount%1;
		System.out.println("Ones = " + ones + ", RemainingAmount = " + remainingAmount);
				
		//Displaying all results in dialog pane
		JOptionPane.showMessageDialog(f, "Requested Amount=" + input + "\nHundreds=" + hundreds + "\nFifties="
		+ fifties + "\nTwenties=" + twenties + "\nTens=" + tens + "\nFives="+fives+"\nTwos=" + twos + "\nOnes="+ones);
	}
}
