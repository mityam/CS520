package cs520.hw1;

import java.util.ArrayList;
import java.util.List;

public class Triples {

	public static void main(String[] args) {
		
		int tripleCounter = 0;
		System.out.println("Count   x    y    z");
		for (int x = 1; x <= 100; x++)
		{
			//for (int y = 1; y <= 100; y++)
			//this below loop is optimal because it takes less iterations and if condition checks 
			for (int y = x + 1; y <= 100; y++) 
			{
				double sum = Math.pow(x, 2) + Math.pow(y, 2);
				int z =  (int) Math.sqrt(sum);
					
				// Checking here if the two integers x and y make an integer z based on x^2+y^2=z^2
				//also checking if x and y are already on tripleList in reverse order
				//if  ( Math.pow(z, 2) == sum && (y > x))
				
				if  ( Math.pow(z, 2) == sum )	
					{
					++tripleCounter;
					//Adding x,y and z values as a string to list to check later if xyzString string is in this list and avoid duplicates
					//System.out.println(tripleCounter + ")" + "        " + x + "     "+ y + "     " + z );
					System.out.printf("%3d) %4d %4d %4d\n", tripleCounter, x, y, z );
					
					}
			} //end of inner loop
		} //end of outer loop
	}
}
