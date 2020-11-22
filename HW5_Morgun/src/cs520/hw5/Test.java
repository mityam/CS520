package cs520.hw5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

//import cs520.hw3.part2.Student;

public class Test {

	public static void main(String[] args) throws IOException {
		
		Queue<Student> studentQueue = new LinkedList<>();
		HashMap<String, Student> studentMap = new HashMap<String, Student>();
	
		
		//part2.2.a
				BufferedReader bufferedReader;
				bufferedReader = new BufferedReader(new FileReader("data.txt"));
				
				//part2.2.a
				System.out.println("Input File Processing...");
				String line;
				while ((line = bufferedReader.readLine()) != null)
				{
					studentQueue.add(processInputData(line));
					studentMap.put(processInputData(line).getName(), processInputData(line));
					System.out.println(processInputData(line));
				}
		bufferedReader.close();
		System.out.println("Iterating over student queue...");
		for (Student item: studentQueue) 
		{
			System.out.println(item);
		}
		
		System.out.println("Iterating over HashMap...");
		Set<String> nameKeys = studentMap.keySet();
		Iterator <String> nameIterator = nameKeys.iterator();
		while (nameIterator.hasNext())
		{
			System.out.println(studentMap.get(nameIterator.next()));
		}
	}

	private static Student processInputData(String value)

	{
		//part2.2.c.1
		StringTokenizer tokenizer = new StringTokenizer(value, ",");
		//part2.2.c.2
		Student currentStudent = new Student(tokenizer.nextToken());
		
		//part2.2.c.3
		/*
		currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken()));
		currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken()));
		currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken()));
		currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken()));
		currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken()));
		currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken()));
		*/
		while (tokenizer.hasMoreTokens())
		{
			currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken()));
		}
		
		//part2.2.c.4
		return currentStudent;
		
	}
	
	
}
