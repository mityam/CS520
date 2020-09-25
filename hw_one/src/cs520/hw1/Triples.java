package cs520.hw1;

public class Triples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Count     x     y     z");
		for (int x=1; x <= 100; x++)
		{
			
			for (int y=1; y <= 100; y++) 
			{
				
				double sum = Math.pow(x, 2) + Math.pow(y, 2);
				int z =  (int) Math.sqrt(sum);
				//System.out.println("x=" + x + "; y=" + y + "; sum =" + sum + "; z =" + z);
				System.out.println("1)" + x*y + "     " + x + "      "+ y + "     " + z);
				
			} //end of inner loop
			
			
			
		} //end of outer loop
		
		
		

	}

}
