package TestNG;






import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;

import Addition.Add;

/*
 * There is no rule of having Test/test word in class or method
 * TestNG Generates reports under target/surfire folder, which has Frontend web result with html file.
 */


public class AddTest {
	@BeforeMethod
	public void setUp() {
		System.out.println("Creating setup.....");
	}
	
	@Test // The annotation state that this method is a testng test.
	public void CaseAddition1() {
		System.out.println("Running TestCase1..");
		final int num1=20;
		final int num2=30;
		final int ans=50;
		final int output=Add.AddNum(num1, num2);
		
		Assert.assertEquals(ans, output); // Provide more methods like string comparision, exceptions etc.
		
	}
	
	@Test // The annotation state that this method is a testng test
	public void CaseAddition2() {
		System.out.println("Running TestCase2..");
		final int num1=20;
		final int num2=30;
		final int ans=50;
		final int output=Add.AddNum(num1, num2);
		
		Assert.assertEquals(ans, output); // Provide more methods like string comparision, exceptions etc.
	}
	
	@AfterMethod // Call this method after every test
	public void tearDown() {
		System.out.println("Destroying generated things from setup.....");
	}
}
