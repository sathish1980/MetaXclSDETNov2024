package TestingBasics;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstDay {
	
	
	@Test
	public void Login()
	{
		//open the browser
		//WebDriver browser = new ChromeDriver();
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		// click back button
		browser.navigate().back();
		//click forward button
		browser.navigate().forward();
		// click on refresh
		browser.navigate().refresh();
		// open the browser
		browser.get("https://www.facebook.com/");
		// open the browser
		//browser.navigate().to("https://www.gmail.com/");
		// close the borwser
		//browser.quit(); // or browser.close()
		
		// locators
		/*
		 * id
		 * name
		 * classname
		 * tagname
		 * linktext
		 * partiallinktext
		 * cssselector
		 * xpath
		 */
		
		WebElement username = browser.findElement(By.id("email"));
		username.sendKeys("kumar.sathish189@gmail.com");
		
		WebElement username1 = browser.findElement(By.name("email"));
		username1.sendKeys("type");
		//username1.click();
		
		//WebElement username3 = browser.findElement(By.className("inputtext _55r1 _6luy"));
		//username3.sendKeys("type");
	}

}
