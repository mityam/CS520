package cs520.hw6;

public class SharedResults {

	/*
	a.The instance (or member) private variable – result (int).
	b.A void addToResult method which takes the given integer argument and
	adds it to the shared result. This method then prints to the console the
	name of the current thread, the value it added, and the cumulative
	result. Handle the synchronization issue with this method.
	c. The getResult method with no arguments which returns the shared
	result. Handle the synchronization issue with this method.
	*/
	
	//part 1.a
	private int result;
	
	//part 1.b
	synchronized void addToResult (int value)
	{
		this.result =  this.result + value;
		System.out.println(Thread.currentThread().getName() +  " is adding value " + value
				+ ", Cumulative result is " + this.result);
		
	}
	
	//part 1.c
	synchronized int getResult()
	{
		return this.result;
	}
}
