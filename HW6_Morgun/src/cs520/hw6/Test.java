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
		
		SharedResults sharedResultsObj = new SharedResults();
		
		LongTask longTaskObj1 = new LongTask (sharedResultsObj, 1, 100);
		LongTask longTaskObj2 = new LongTask (sharedResultsObj, 101, 200);
		LongTask longTaskObj3 = new LongTask (sharedResultsObj, 201, 300);
		LongTask longTaskObj4 = new LongTask (sharedResultsObj, 301, 400);
		LongTask longTaskObj5 = new LongTask (sharedResultsObj, 401, 500);
		
		
		System.out.println(sharedResultsObj.getResult());

	}

}
