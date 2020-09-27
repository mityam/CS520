package cs520.hw1;

import java.util.ArrayList;
import java.util.List;

public class Triples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tripleCounter = 0;
		List<String> tripleList = new ArrayList();
		System.out.println("Count     x     y     z");
		for (int x = 1; x <= 100; x++)
		{
			
			for (int y = 1; y <= 100; y++) 
			{
				double sum = Math.pow(x, 2) + Math.pow(y, 2);
				int z =  (int) Math.sqrt(sum);
				//this string gets added to tripleList later inside If
				String xyzString = Integer.toString(x) + Integer.toString(y);
				//this is a reverse string that is used for checking on duplicates in tripleList
				String reverseXYZString =  Integer.toString(y) + Integer.toString(x);
				
				// Checking here if the two integers x and y make an integer z based on x^2+y^2=z^2
				//also checking if x and y are already on tripleList in reverse order
				if  ( Math.pow(z, 2) == sum && (!tripleList.contains(reverseXYZString)))
					{
					tripleCounter = ++tripleCounter;
					//Adding x,y and z values as a string to list to check later if xyzString string is in this list and avoid duplicates
					tripleList.add( xyzString );
					System.out.println(tripleCounter + ")" + "        " + x + "     "+ y + "     " + z );
					}
			} //end of inner loop
		} //end of outer loop
		
		
		System.exit(0);

	}

}
