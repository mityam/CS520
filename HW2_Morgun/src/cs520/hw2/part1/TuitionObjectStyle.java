package cs520.hw2.part1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TuitionObjectStyle {

	public static void main(String[] args) {
		
		 JFrame f=new JFrame();
		 //creating two objects of Course class	
		 Course course1 = new Course();
		 Course course2 = new Course();
	 
		 //getting all user input and setting it to fields of course objects using setters
		 course1.setName(JOptionPane.showInputDialog("Enter name of the first course"));
		 course1.setNumberOfCredits(Integer.parseInt(JOptionPane.showInputDialog("Enter number of credits for the first course")));
		 course1.setCostPerCredit(Integer.parseInt(JOptionPane.showInputDialog("Enter cost per credit for the first course")));
		 course2.setName(JOptionPane.showInputDialog("Enter name of the second course"));
		 course2.setNumberOfCredits(Integer.parseInt(JOptionPane.showInputDialog("Enter number of credits for the second course")));
		 course2.setCostPerCredit(Integer.parseInt(JOptionPane.showInputDialog("Enter cost per credit for the second course")));
	 
		 
		 
		//displaying course names and tuition using public method defined in Course class
			course1.printTuitionDetails();
			course2.printTuitionDetails();

		//using if else	structure for tuition comparison
			if ( course1.getTotalTuition() > course2.getTotalTuition() )
				{
				JOptionPane.showMessageDialog(f, "The 1st course tution is greater than the 2nd course tution by "
				+ (course1.getTotalTuition()-course2.getTotalTuition()));
				}
			else if ( course1.getTotalTuition() == course2.getTotalTuition() )
				{
				JOptionPane.showMessageDialog(f, "The 1st and 2nd course tutions are the same" );
				}
			else
				{
				JOptionPane.showMessageDialog(f, "The 2nd course tution is greater than the 1st course tution by "
						+ (course2.getTotalTuition()-course1.getTotalTuition()));
				}
		}

}
