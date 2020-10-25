package cs520.hw3.part2;

public class Student {
	
	//part2.1.a
	private String name;
	private int homework1, homework2, homework3, homework4, homework5, homework6;
	
	//part2.1.b
	public Student (String value)
	{
		this.name = value;
	}
	
	//part2.1.c
	public void setHomework1 (int value)
	{ this.homework1 = value; }
	public void setHomework2 (int value)
	{ this.homework2 = value; }
	public void setHomework3 (int value)
	{ this.homework3 = value; }
	public void setHomework4 (int value)
	{ this.homework4 = value; }
	public void setHomework5 (int value)
	{ this.homework5 = value; }
	public void setHomework6 (int value)
	{ this.homework6 = value; }
	
	//part2.1.d
	public double computeAverage()
	{
		return (homework1 + homework2 + homework3 + homework4 + homework5 + homework6)/6;
	}

	//part2.1.e
	public String toString()
	{
		return  "The " + this.name + "’s average grade is " + this.computeAverage();
	}
	
}
