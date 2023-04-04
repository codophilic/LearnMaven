package Junit5;





import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Addition.Add;



/*
 * There is no rule of having Test/test word in class or method
 * In POM, the scope for Junit is defined as Test, so it will only work under test directories. If we remove the scope then Junit can
 * also be written src/main/java files.
 */

public class ITAddTest2 {
	@BeforeEach // Call this method before every test
	public void setUp() {
		System.out.println("Creating setup.....");
	}
	
	@Test // The annotation state that this method is a Junit test
	public void CaseAddition3() {
		System.out.println("Running TestCase3..");
		final int num1=20;
		final int num2=30;
		final int ans=50;
		final int output=Add.AddNum(num1, num2);
		
		assertEquals(ans, output); // Provide more methods like string comparision, exceptions etc.
	}
	
	@Test // The annotation state that this method is a Junit test
	public void CaseAddition4() {
		System.out.println("Running TestCase4..");
		final int num1=20;
		final int num2=30;
		final int ans=50;
		final int output=Add.AddNum(num1, num2);
		
		assertEquals(ans, output); // Provide more methods like string comparision, exceptions etc.
	}
	
	@AfterEach // Call this method after every test
	public void tearDown() {
		System.out.println("Destroying generated things from setup.....");
	}
}
