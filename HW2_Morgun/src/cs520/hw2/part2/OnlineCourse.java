package cs520.hw2.part2;

//declaration of a child OnlineCourse class that inherits Course subclass
public class OnlineCourse extends Course{
	
	private int technologyFee;
	
	//child class constructor
	public OnlineCourse (String courseName, int courseNumberOfCredits, int courseCostPerCredit, int courseTechnologyFee)
	{   
		//invocation of super class constructor
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
	//overriding  getTotalTuition method of superclass
	public int getTotalTuition ()
	{
	 return this.getNumberOfCredits() *  this.getCostPerCredit() + this.getNumberOfCredits() * this.getTechnologyFee();
	}
	//overriding toString method
	public String toString()
	{
		return "OnlineCourse:"+this.getName()+" @ $" + this.getTotalTuition();
	}
}
