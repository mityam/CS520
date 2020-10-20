package cs520.hw2.part2;

public class Test {

	public static void main(String[] args) {
		
		System.out.println ("Taking a regular course...");
		//creating an object of Course class
		Course currentCourse = new Course ("CS520",4,390);
		System.out.println ("Printing...");
		//using the overridden toString method
		System.out.println (currentCourse.toString());
		
		System.out.println ("\nTaking a online course...");
		//creating an object of OnlineCourse subclass
		Course currentOnlineCourse = new OnlineCourse ("CS520",4,760,60);
		
		//reassigning currentCourse object to currentOnlineCourse object
		//currentCourse = currentOnlineCourse;
		
		System.out.println ("Printing...");
		//testing toString method on currentCourse object; it uses child class OnlineCourse toString method
		System.out.println (currentOnlineCourse.toString());
	}

}
