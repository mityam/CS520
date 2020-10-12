package cs520.hw2.part2;

public class Course {

	private String name;
	private int numberOfCredits;
	private int costPerCredit;
	
	
	public Course (String courseName, int courseNumberOfCredits, int courseCostPerCredit )
	{
		this.setName(courseName);
		this.setNumberOfCredits(courseNumberOfCredits);
		this.setCostPerCredit(courseCostPerCredit);
		System.out.println ("In Course Constructor values set:");
		System.out.println ("  CourseName = " + this.getName() + ", NumberOfCredits = "
		+ this.getNumberOfCredits()+ ", CostPerCredit = $" + this.getCostPerCredit());
	}
		
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
		 return this.getNumberOfCredits() *  this.getCostPerCredit();
	 }
	public String toString()
	{
		return "Course:"+this.getName()+" @ $" + this.getTotalTuition();
	}
}
