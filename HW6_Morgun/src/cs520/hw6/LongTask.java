package cs520.hw6;

public class LongTask extends Thread{
	/*
	 a. The instance (or member) private variables – sharedData (of
		type SharedResults), start (integer) and end (integer).
	 b. A single constructor which takes the above three arguments and
		stores them in the instance values. Also, create a name for this
		thread as Thread_<start>_<end>
	 c.In the run method, add the integer numbers from start to end (both
		inclusive) using a for loop. Also, sleep for a random time (up to 10
		milliseconds) in each iteration of the loop. After the loop, invoke the
		addToResult method of the shared object and provide this
		accumulated sum.
	 */
	
	//part 2.a
	private SharedResults sharedData;
	private int start, end;
	
	//part 2.b
	LongTask (SharedResults value, int startValue, int endValue)
	{
		this.sharedData = value;
		this.start = startValue;
		this.end = endValue;
		String threadName = "Thread_" + this.start + "_" + this.end;
		this.setName(threadName);
	}
	
	//part 2.c
	public void run()
	{
		int fakeCounter = 0;
		for (int i=0; i < 10; i++)
		{
			fakeCounter = this.start + this.end;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		sharedData.addToResult(fakeCounter);
	}
	
}
