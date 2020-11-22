package cs520.hw5;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
	
	//1.a
	private String name;
	private ArrayList<Integer> homeworks; 
	
	//1.b
	public Student (String name)
	{
		this.setName(name);
		this.homeworks= new ArrayList<>();
	}
	
	//1.c
	public void setName (String value)
	{this.name = value;}
	public String getName ()
	{return this.name;}
	
	//1.d
	void addHomeworkGrade(int value)
	{
		this.homeworks.add(value);
	}
	
	//1.e
	public double computeAverage()
	{
		double sumOfGrades=0;
		for (int element: this.homeworks)
		{
			sumOfGrades = sumOfGrades + element;
		}
		return sumOfGrades/this.homeworks.size();
	}
	//1.f
	public String toString()
	{
		//DecimalFormat df = ( this.computeAverage()%1 == 0 ) ? new DecimalFormat("#.00") : new DecimalFormat("#.##");
		//String formatted = df.format(this.computeAverage());
		//return  "The " + this.name + "’s average grade is " + formatted; 
		return  "The " + this.name + "’s average grade is " + this.computeAverage();
	}
	
}
