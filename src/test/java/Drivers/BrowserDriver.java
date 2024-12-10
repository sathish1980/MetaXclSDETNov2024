package Drivers;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utils.PropertyFile;

public class BrowserDriver {

	public WebDriver driver;
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	//helps to generate the logs in test report.
	public static ExtentTest test;
	
	String reportpath = System.getProperty("user.dir")+"//Reports//Automation.html";
	public void LaunchTheBrowser() throws IOException
	{
		String browserName = PropertyFile.readData().getProperty("browser");
		if(browserName.equalsIgnoreCase("Chrome"))
		{
		driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
		driver= new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		CreateorStartReport();
	}
	
	public void CloseTheBrowser()
	{
		CloseReport();
		driver.quit();
	}
	
	public void CreateorStartReport()
	{
		htmlReporter = new ExtentSparkReporter(reportpath);
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	}
	
	
	public void CloseReport()
	{
		extent.flush();
	}
}
