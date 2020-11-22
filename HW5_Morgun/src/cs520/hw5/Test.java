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


public class Test {

	public static void main(String[] args) throws IOException {
		
		//part 2.a
		Queue<Student> studentQueue = new LinkedList<>();
		//part 2.b
		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		//part 2.c
		BufferedReader bufferedReader;
		bufferedReader = new BufferedReader(new FileReader("data.txt"));
		//part 2.d
		System.out.println("Input file processing...");
		String line;
		//part 2.d.1
		while ((line = bufferedReader.readLine()) != null)
		{
			Student currentStudent = processInputData(line); 
			//part 2.d.2
			studentQueue.add(currentStudent);
			//part 2.d.3
			studentMap.put(currentStudent.getName(), currentStudent);
		}
		bufferedReader.close();
		//part 2.d.e.1
		System.out.println("\nIterating over the student list...");
		for (Student item: studentQueue) 
		{
			System.out.println(item);
		}
		//part 2.d.e.2
		System.out.println("\nIterating the student map...");
		Set<String> nameKeys = studentMap.keySet();
		Iterator <String> nameIterator = nameKeys.iterator();
		while (nameIterator.hasNext())
		{
			System.out.println(studentMap.get(nameIterator.next()));
		}
	}

	private static Student processInputData(String value)

	{
		//part 2.1
		StringTokenizer tokenizer = new StringTokenizer(value, ",");
		//part 2.2
		Student currentStudent = new Student(tokenizer.nextToken());
		//part2.3
		while (tokenizer.hasMoreTokens())
		{
			currentStudent.addHomeworkGrade(Integer.parseInt(tokenizer.nextToken()));
		}
		//part2.4
		System.out.println(currentStudent.toString());
		//part2.5
		return currentStudent;
	}
	
	
}
