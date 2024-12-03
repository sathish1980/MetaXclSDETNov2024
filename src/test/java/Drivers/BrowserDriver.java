package Drivers;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.PropertyFile;

public class BrowserDriver {

	public WebDriver driver;
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
	}
	
	public void CloseTheBrowser()
	{
		driver.quit();
	}
}
