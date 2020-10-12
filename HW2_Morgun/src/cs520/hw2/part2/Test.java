package cs520.hw2.part2;

public class Test {

	public static void main(String[] args) {
		
		System.out.println ("Taking a regular course...");
		Course currentCourse = new Course ("CS520",4,390);
		System.out.println ("Printing...");
		System.out.println (currentCourse.toString());
		
		System.out.println ("\nTaking a online course...");
		OnlineCourse currentOnlineCourse = new OnlineCourse ("CS520",4,760,60);
		//System.out.println ("Printing...");
		//System.out.println (currentOnlineCourse.toString());
		
		
		currentCourse = currentOnlineCourse;
		//currentOnlineCourse = (OnlineCourse) currentCourse;
		System.out.println ("Printing...");
		System.out.println (currentCourse.toString());
	}

}
