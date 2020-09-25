package cs520.hw1;

public class Triples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tripleCounter = 0;
		System.out.println("Count     x     y     z");
		for (int x=1; x <= 20; x++)
		{
			
			for (int y=1; y <= 20; y++) 
			{
				
				double sum = Math.pow(x, 2) + Math.pow(y, 2);
				int z =  (int) Math.sqrt(sum);
				
				if  ( Math.pow(z, 2) == sum )
					{
					tripleCounter = ++tripleCounter;
					System.out.println(tripleCounter + ")" + "        " + x + "     "+ y + "     " + z + "  sum=" + sum );
					
					}
				
			} //end of inner loop
		} //end of outer loop
		
		
		System.exit(0);

	}

}
