package TestingBasics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WindowsHandling {

	

	@Test
	public void WH()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/window.xhtml");
		// get the current window name
		String parentwindow = browser.getWindowHandle();
		browser.findElement(By.id("j_idt88:new")).click();
		
		// get all the windows name
		Set<String> allwindowsName = browser.getWindowHandles();
		for(String eachwindow : allwindowsName)
		{
			if(!eachwindow.equalsIgnoreCase(parentwindow))
			{
				browser.switchTo().window(eachwindow);
				List<WebElement> elementexist = browser.findElements(By.id("menuform:j_idt40"));
			
				if(elementexist.size()>0)
				{
					browser.findElement(By.id("menuform:j_idt40")).click();
					browser.findElement(By.id("menuform:m_input")).click();
					browser.findElement(By.id("j_idt88:name")).sendKeys("Sathish");
					browser.switchTo().window(parentwindow);
				}
				browser.switchTo().window(parentwindow);
			}
			
		}
	}
	
}
