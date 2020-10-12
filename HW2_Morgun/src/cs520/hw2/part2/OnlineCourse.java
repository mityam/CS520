package cs520.hw2.part2;

public class OnlineCourse extends Course{
	
	private int technologyFee;
	
	public OnlineCourse (String courseName, int courseNumberOfCredits, int courseCostPerCredit, int courseTechnologyFee)
	{   
		super(courseName,courseNumberOfCredits,courseCostPerCredit);
		this.setTechnologyFee (courseTechnologyFee);
		System.out.println ("In OnlineCourse Constructor values set:");
		System.out.println ("  CourseName = " + this.getName() + ", NumberOfCredits = "
		+ this.getNumberOfCredits()+ ", CostPerCredit = $" + this.getCostPerCredit() + ", TechnologyFee = $" + courseTechnologyFee);
	}
	
	public void setTechnologyFee (int courseTechnologyFee)
	{
		this.technologyFee = courseTechnologyFee;
	}
	public int getTechnologyFee ()
	{
		return this.technologyFee;
	}
	
	public int getTotalTuition ()
	{
	 return this.getNumberOfCredits() *  this.getCostPerCredit() + this.getNumberOfCredits() * this.getTechnologyFee();
	}
	public String toString()
	{
		return "OnlineCourse:"+this.getName()+" @ $" + this.getTotalTuition();
	}
}
