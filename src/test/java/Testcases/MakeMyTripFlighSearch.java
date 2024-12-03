package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Commons.CommonElements;
import Drivers.BrowserDriver;
import Utils.PropertyFile;

public class MakeMyTripFlighSearch extends BrowserDriver{

	@BeforeSuite
	public void Launch() throws IOException
	{
		LaunchTheBrowser();
	}
	
	@BeforeTest
	public void EnterUrl() throws IOException
	{
		String url =PropertyFile.readData().getProperty("url");
		driver.get(url);
	}
	
	@BeforeClass
	public void ClosePopup()
	{
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@data-cy='closeModal']")));*/
		
		CommonElements.WaitUntilClickable(driver, By.xpath("//*[@data-cy='closeModal']"));
		driver.findElement(By.xpath("//*[@data-cy='closeModal']")).click();
	}
	
	@Test(priority=0)
	public void SearchWithValidFlightDetails()
	{
		/*
		 * Steps:
		 * Open the browser
		 * Enter the URL
		 * Close th Popup
		 * Select From location
		 * Select To Location
		 * Select Depature
		 * Click Search button
		 * Validate the search result
		 */
	}
	
	@Test(priority=1)
	public void SearchWithSameLocation()
	{
		/*
		 * Steps:
		 * Open the browser
		 * Enter the URL
		 * Close th Popup
		 * Select From location
		 * Select To Location as same as From Location
		 * Validate the same city error occurs
		 */
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		CloseTheBrowser();
	}
}
