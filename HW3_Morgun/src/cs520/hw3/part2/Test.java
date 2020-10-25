package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		
	try {	
		//part2.2.a
		BufferedReader bufferedReader;
		bufferedReader = new BufferedReader(new FileReader("data.txt"));
		
		//part2.2.a
		String line;
		while ((line = bufferedReader.readLine()) != null)
		{
			//part2.2.c.4
			System.out.println(processInputData(line));
		}
	}
	
	catch (FileNotFoundException e)
	{
		System.out.println("File not found"); 
		System.out.println("Exception = " + e.toString());
	}
	catch (IOException e)
	{
		System.out.println("Error reading data.txt"); 
		System.out.println("Exception = " + e.toString());
	}
	
	}

	
//part2.2.c	
private static String processInputData(String value)

{
	//part2.2.c.1
	StringTokenizer tokenizer = new StringTokenizer(value, ",");
	//part2.2.c.2
	Student currentStudent = new Student(tokenizer.nextToken());
	
	//part2.2.c.3
	currentStudent.setHomework1(Integer.parseInt(tokenizer.nextToken()));
	currentStudent.setHomework2(Integer.parseInt(tokenizer.nextToken()));
	currentStudent.setHomework3(Integer.parseInt(tokenizer.nextToken()));
	currentStudent.setHomework4(Integer.parseInt(tokenizer.nextToken()));
	currentStudent.setHomework5(Integer.parseInt(tokenizer.nextToken()));
	currentStudent.setHomework6(Integer.parseInt(tokenizer.nextToken()));
	
	//part2.2.c.4
	return currentStudent.toString();
	
}
	
	
	
}
