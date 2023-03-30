package Junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Addition.Add;

/*
 * There is no rule of having Test/test word in class or method
 * In POM, the scope for Junit is defined as Test, so it will only work under test directories. If we remove the scope then Junit can
 * also be written src/main/java files.
 */

public class AddTest {
	@Before // Call this method before every test
	public void setUp() {
		System.out.println("Creating setup.....");
	}
	
	@Test // The annotation state that this method is a Junit test
	public void CaseAddition1() {
		System.out.println("Running TestCase1..");
		final int num1=20;
		final int num2=30;
		final int ans=50;
		final int output=Add.AddNum(num1, num2);
		
		org.junit.Assert.assertEquals(ans, output); // Provide more methods like string comparision, exceptions etc.
	}
	
	@Test // The annotation state that this method is a Junit test
	public void CaseAddition2() {
		System.out.println("Running TestCase2..");
		final int num1=20;
		final int num2=30;
		final int ans=50;
		final int output=Add.AddNum(num1, num2);
		
		org.junit.Assert.assertEquals(ans, output); // Provide more methods like string comparision, exceptions etc.
	}
	
	@After // Call this method after every test
	public void tearDown() {
		System.out.println("Destroying generated things from setup.....");
	}
}
