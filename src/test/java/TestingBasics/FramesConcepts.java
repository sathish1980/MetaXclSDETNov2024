package TestingBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FramesConcepts {
	

	@Test
	public void keyboardactions()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/frame.xhtml");
		//browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
		/*
		 * to interact with frame we can do it by 3 ways
		 * id
		 * name
		 * index
		 */
		
		List<WebElement> allFrames = browser.findElements(By.tagName("iframe"));
		for(int i=0;i<allFrames.size();i++)
		{
			browser.switchTo().frame(i);
			List<WebElement> elementExist = browser.findElements(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]"));
			if(elementExist.size()>0)
			{
				browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
				browser.switchTo().defaultContent();
				break;
			}
			browser.switchTo().defaultContent();
		}
	}

}
