package TestingBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class screenshot {

	
	@Test
	public void screenhot() throws IOException
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/input.xhtml");
		screenshottake(browser,"homepage");
		browser.findElement(By.id("j_idt88:name")).sendKeys("sathish");
		screenshottake(browser,"enteredData");
	}
	
	public void screenshottake(WebDriver browser , String filename) throws IOException
	{
		TakesScreenshot t = (TakesScreenshot) browser;
		File sourcefile = t.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("C:\\Users\\kumar\\eclipse-workspace\\MetaXclSDETNov2024\\screenshots\\"+filename+".png");
		FileUtils.copyFile(sourcefile, destinationfile);
	}
}
