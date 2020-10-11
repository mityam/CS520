package cs520.hw2.part1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TuitionProceduralStyle {

	public static void main(String[] args) {
	
		JFrame f=new JFrame();
		// Getting all user input
		String inputNameOf1stcourse = JOptionPane.showInputDialog("Enter name of the first course");
		String inputNumOfCredits1stcourse = JOptionPane.showInputDialog("Enter number of credits for the first course");
		String inputCostPerCredit1stcourse = JOptionPane.showInputDialog("Enter cost per credit for the first course");
		String inputNameOf2ndcourse = JOptionPane.showInputDialog("Enter name of the second course");
		String inputNumOfCredits2ndcourse = JOptionPane.showInputDialog("Enter number of credits for the second course");
		String inputCostPerCredit2ndcourse = JOptionPane.showInputDialog("Enter cost per credit for the second course");
		
		// converting input strings to integers and calculating tuition
		int numOfCredits1stcourse = Integer.parseInt(inputNumOfCredits1stcourse);
		int costPerCredit1stcourse = Integer.parseInt(inputCostPerCredit1stcourse);
		int tutionOf1stcourse = numOfCredits1stcourse * costPerCredit1stcourse;
		int numOfCredits2ndcourse = Integer.parseInt(inputNumOfCredits2ndcourse);
		int costPerCredit2ndcourse = Integer.parseInt(inputCostPerCredit2ndcourse);
		int tutionOf2ndcourse = numOfCredits2ndcourse * costPerCredit2ndcourse;
		
		//displaying course names and tuitions
		JOptionPane.showMessageDialog(f, "Name of the first course = " + inputNameOf1stcourse 
								+ "\nTution of the first course = " + tutionOf1stcourse );
		JOptionPane.showMessageDialog(f, "Name of the second course = " + inputNameOf2ndcourse 
				+ "\nTution of the first course = " + tutionOf2ndcourse );

	//using if else	structure for tuition comparison
		if ( tutionOf1stcourse > tutionOf2ndcourse )
			{
			JOptionPane.showMessageDialog(f, "The 1st course tution is greater than the 2nd course tution by "
			+ (tutionOf1stcourse-tutionOf2ndcourse));
			}
		else if ( tutionOf1stcourse == tutionOf2ndcourse )
			{
			JOptionPane.showMessageDialog(f, "The 1st and 2nd course tutions are the same" );
			}
		else
			{
			JOptionPane.showMessageDialog(f, "The 2nd course tution is greater than the 1st course tution by "
					+ (tutionOf2ndcourse-tutionOf1stcourse));
			}
		}
}
