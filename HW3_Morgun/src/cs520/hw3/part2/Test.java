package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
	try {	
		BufferedReader bufferedReader;
		bufferedReader = new BufferedReader(new FileReader("data.txt"));

	}
	
	catch (FileNotFoundException e)
	{
		System.out.println("Exception = " + e.toString());
	}
	catch (IOException e)
	{
		
	}
	
	}

}
