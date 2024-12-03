package TestNgCommands;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgcomands {
	

	
	
	@Test(priority=0,invocationCount=5,invocationTimeOut=60)
	public void testcase2()
	{
		System.out.println("Test case2");
	}
	
	@Test(priority=1,timeOut=10)
	public void testcase3() throws InterruptedException
	{
		System.out.println("Test case3");
		Thread.sleep(20000);
	}
	
	@Test(priority=2,enabled=false)
	public void testcase1()
	{
		System.out.println("Test case1");
	}

	@BeforeSuite
	public void Bfs()
	{
		System.out.println("Before Suite");
		/*
		 * browser opening
		 */
	}
	
	@AfterSuite
	public void afs()
	{
		System.out.println("After Suite");
		/*
		 * browser close
		 */
	}
	
	@BeforeTest
	public void bft()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void aft()
	{
		System.out.println("After Test");
	}
}
