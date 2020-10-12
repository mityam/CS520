package cs520.hw2.part1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Course {
	
	private String name;
	private int numberOfCredits;
	private int costPerCredit;
	private JFrame f=new JFrame();
		
	public void setName (String courseName)
	{
		this.name = courseName;
	}
	public void setNumberOfCredits (int courseNumberOfCredits)
	{
		this.numberOfCredits = courseNumberOfCredits;
	}
	public void setCostPerCredit (int courseCostPerCredit)
	{
		this.costPerCredit = courseCostPerCredit;
	}
	
	public String getName ()
	{
		return this.name;
	}
	public int getNumberOfCredits ()
	{
		return this.numberOfCredits;
	}
	public int getCostPerCredit ()
	{
		return this.costPerCredit;
	}
	
	 public int getTotalTuition ()
	 {
		 return this.numberOfCredits *  this.costPerCredit;
	 }
		
	 public void printTuitionDetails ()
	 {
		 JOptionPane.showMessageDialog(this.f, "Name of this course is " + this.name 
					+ "\nTution of this course is " + getTotalTuition() );
	 }
}
