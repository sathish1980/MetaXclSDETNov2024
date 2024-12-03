package TestNgCommands;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGcommands1 {
	
	/*\
	 * BeforeSuite
	 * BeforeTest
	 * BeforeClass
	 * BeforeMethod
	 * Testcase
	 * AfterMethod
	 * AfterClass
	 * AfterTest
	 * AfterSuite
	 */
	@Test
	public void testcase4()
	{
		System.out.println("Test case4");
	}
	
	@Test
	public void testcase5()
	{
		System.out.println("Test case5");
	}
	
	@Test
	public void testcase6()
	{
		System.out.println("Test case6");
	}

	@BeforeClass
	public void bfc()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afc()
	{
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void bfm()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afm()
	{
		System.out.println("After Method");
	}
}
