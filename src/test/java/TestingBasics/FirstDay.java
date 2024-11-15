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
		 * tagname --onHold
		 * linktext
		 * partiallinktext
		 * cssselector
		 * xpath
		 */
		
		WebElement username = browser.findElement(By.id("email"));
		username.sendKeys("kumar.sathish189@gmail.com");
		
		WebElement username1 = browser.findElement(By.name("email"));
		username1.sendKeys("type");
		username1.clear();
		//username1.click();
		
		//WebElement username3 = browser.findElement(By.className("inputtext _55r1 _6luy"));
		//username3.sendKeys("type");
		
		//browser.findElement(By.linkText("Forgotten password?")).click();
		
		//browser.findElement(By.partialLinkText("pass")).click();
		
		/*
		 * Css Selector
		 * Tag and  ID -- Tag#id
		 * Tag and Class -- Tag.class
		 * Tag and attribute -- Tag[attribute=value]
		 * Tag,Class and Atrribute -- Tag.class[attribute=value]
		 * Startswith -- [attribute^='staringvlaue of the attribute']
		 * endswith -- [attribute$='end value of the attribute']
		 * contains --[attribute*='any value of the attribute']
		 */
		
		browser.findElement(By.cssSelector("input#email")).sendKeys("test");
		
		//browser.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).clear();
		
		browser.findElement(By.cssSelector("input[data-testid='royal_email']")).clear();
		
		//browser.findElement(By.cssSelector("input.inputtext _55r1 _6luy[data-testid='royal_email']")).sendKeys("test");
		
		
		/*
		 * Xpath -XML Path
		 * 2 types
		 * absolute xpath -- extact path of the element
		 * relative xpath -- some were in the DOM structure
		 * 5 Types
		 * Basic xpath --//tagname[@attribute='value']     or //*[@attribute='value']
		 * Starts-with -- //tagname[starts-with(@attribute,'value')]     
		 * contains -- //tagname[contains(@attribute,'value')]
		 * and or
		 * text
		 */
		
		browser.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("Meta Xcel");
		
		browser.findElement(By.xpath("//input[@type='text']")).clear();
	
		browser.findElement(By.xpath("//input[starts-with(@placeholder,'Email')]")).sendKeys("yeah");
	
		browser.findElement(By.xpath("//*[starts-with(@placeholder,'Email')]")).sendKeys("yeah");

	}

}
