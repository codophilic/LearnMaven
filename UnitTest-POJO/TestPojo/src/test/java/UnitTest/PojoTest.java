package UnitTest;

import Unit.test.pojo;

/*
 * The test files name must have ending filename as ..Test, it must have method starting with test*
 */


// Validation in test can be done using assert keyword

/*
 * Output will  be  like
 * 
 * 
 * 
 * [INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running UnitTest.PojoTest
Creating setup.....
Running TestCase2..
Destroying generated things from setup.....
Creating setup.....
Running TestCase1..
Destroying generated things from setup.....
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.008 s - in UnitTest.PojoTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.644 s
[INFO] Finished at: 2023-03-30T12:10:39+05:30
[INFO] ------------------------------------------------------------------------
*/

// Taking the latest surefire plugin which detects setUp() and tearDown() methods

public class PojoTest {
	
	public void setUp() {
		System.out.println("Creating setup.....");
	}
	
	public void testAddition1() {
		System.out.println("Running TestCase1..");
		final int num1=20;
		final int num2=30;
		final int ans=50;
		final int output=pojo.Addition(num1, num2);
		
		assert ans == output;
	}
	public void testAddition2() {
		System.out.println("Running TestCase2..");
		final int num1=20;
		final int num2=30;
		final int ans=50;
		final int output=pojo.Addition(num1, num2);
		
		assert ans == output;
	}
	
	public void tearDown() {
		System.out.println("Destroying generated things from setup.....");
	}
}
