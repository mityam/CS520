package cs520.hw6;

public class Test {
	/*
	 a. Create the SharedResults object and assign it to a variable.
	 b. Create five LongTask objects by passing the above shared
		object and the start and end values for each as (1, 100), (101, 200),
		(201, 300), (301, 400), and (401, 500) respectively.
	 c.Start each thread as it is created.
	 d. Wait for all the threads to complete using the join method.
	 e. Print the result from the shared object.
	 */
	public static void main(String[] args) {
		
		//part 3.a
		SharedResults sharedResultsObj = new SharedResults();
		//part 3.b
		Thread longTaskObj1 = new LongTask (sharedResultsObj, 1, 100);
		//part 3.c
		longTaskObj1.start();
		//part 3.b
		Thread longTaskObj2 = new LongTask (sharedResultsObj, 101, 200);
		//part 3.c
		longTaskObj2.start();
		//part 3.b
		Thread longTaskObj3 = new LongTask (sharedResultsObj, 201, 300);
		//part 3.c
		longTaskObj3.start();
		//part 3.b
		Thread longTaskObj4 = new LongTask (sharedResultsObj, 301, 400);
		//part 3.c
		longTaskObj4.start();
		//part 3.b
		Thread longTaskObj5 = new LongTask (sharedResultsObj, 401, 500);
		//part 3.c
		longTaskObj5.start();
		
		//part 3.d
		try {
			longTaskObj1.join();
			longTaskObj2.join();
			longTaskObj3.join();
			longTaskObj4.join();
			longTaskObj5.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//part 3.e
		System.out.println("Result = " + sharedResultsObj.getResult());

	}

}
