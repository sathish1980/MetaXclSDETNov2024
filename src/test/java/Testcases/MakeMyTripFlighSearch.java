package Testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Commons.CommonElements;

import Drivers.BrowserDriver;
import Utils.PropertyFile;
import pages.MAkeMyTripSearchResultPage;
import pages.MakeMyTripSearchPage;

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
	
	@Test(priority=0,dataProvider="GetValidSearchTestData",dataProviderClass=DataProviderDetails.class)
	public void SearchWithValidFlightDetails(String from, String to,String date)
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
		MakeMyTripSearchPage MSP = new MakeMyTripSearchPage(driver);
		test = extent.createTest("SearchWithValidValues Testcase");
		MSP.ClickFromLocationdropdown();
		test.log(Status.INFO, "From DropDown is Clicked");
		MSP.SelectFromLocation(from);
		test.log(Status.INFO, "From DropDown is Clicked as "+from);
		MSP.ClickToLocationdropdown();
		MSP.SelectToLocation(to);
		test.log(Status.INFO, "to DropDown is Clicked as "+to);
		MSP.SelectDate(date);
		test.log(Status.INFO, "Date is selected as "+date);
		MSP.clickOnSearchbutton();
		test.log(Status.INFO, "Search Button is clicked");
		MAkeMyTripSearchResultPage MSRP = new MAkeMyTripSearchResultPage(driver);
		String actualValue = MSRP.GetsearchResult();
		String expectedValue = "NETWORK PROBLEM";
		Assert.assertEquals(expectedValue, actualValue);
		CommonElements.ClickOnBackButton(driver);
	}
	
	
	@Test(priority=1,dataProvider="GetSameCitySearchTestData",dataProviderClass=DataProviderDetails.class)
	public void SearchWithSameLocation(String from,String to)
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
		MakeMyTripSearchPage MSP = new MakeMyTripSearchPage(driver);
		test = extent.createTest("Search with Same City Error Testcase");
		MSP.ClickFromLocationdropdown();
		MSP.SelectFromLocation(from);
		test.log(Status.INFO, "From DropDown is Clicked as "+from);
		MSP.ClickToLocationdropdown();
		MSP.SelectToLocation(to);
		test.log(Status.INFO, "From DropDown is Clicked as "+from);
		String actualError = MSP.GetSameCityError();
		String expectedError= "From & To airports cannot be the same";
		Assert.assertEquals(actualError, expectedError);
	}
	
	@AfterMethod
	public void WriteInReport(ITestResult result) throws IOException
	{
		if (result.getStatus()==ITestResult.SUCCESS) {
			String filePath = CommonElements.getScreenshot(driver,result.getName());
		     test.log(Status.INFO,test.addScreenCaptureFromPath(filePath).toString());
            test.log(Status.PASS,"Test Method named as : "+ result.getName()+" is passed");

        }else if(result.getStatus()==ITestResult.FAILURE) {
            test.log(Status.PASS,"Test Method named as : "+ result.getName()+" is FAILED");
            String filePath = CommonElements.getScreenshot(driver,result.getName());
            test.log(Status.INFO,test.addScreenCaptureFromPath(filePath).toString());
            test.log(Status.FAIL,"Test failure : "+ result.getThrowable());
        }
        else if(result.getStatus()==ITestResult.SKIP) {
            test.log(Status.SKIP,"Test Method named as : "+ result.getName()+" is skipped");
        }
	}
	
	@AfterSuite
	public void CloseBrowser()
	{
		CloseTheBrowser();
	}
}
