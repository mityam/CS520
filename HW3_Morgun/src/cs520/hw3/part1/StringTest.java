package cs520.hw3.part1;

import javax.swing.JOptionPane;

public class StringTest {

	public static void main(String[] args) {
		//part 1.a
		String input = JOptionPane.showInputDialog("Please enter data using the format CourseId,CourseName,Tuition");
		//part 1.b
		String trimmedString = input.trim();
		//part 1.c
		System.out.println (trimmedString);
		//part 1.d
		int firstComma = trimmedString.indexOf(",");
		//part 1.e
		System.out.println ("First Comma Position:" + firstComma
				+ ", Course Id:" + trimmedString.substring(0,firstComma)
				+ ", Length:" + trimmedString.substring(0,firstComma).length());
		//part 1.f
		int secondComma = trimmedString.indexOf(",",firstComma+1);
		//part 1.g
		System.out.println ("Second Comma Position:" + secondComma
				+ ", Course Name:" + trimmedString.substring(firstComma+1,secondComma)
				+ ", Length:" + trimmedString.substring(firstComma+1,secondComma).length());
		//part 1.h
		int tuition = Integer.parseInt(trimmedString.substring(secondComma+1));
		System.out.println ("Regular Tuition $" + tuition
				+ ", Discount Tuition $" + (tuition - tuition/4) );
		
		
	}

}
