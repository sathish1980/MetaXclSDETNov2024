package TestingBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class mousehandlings {

	
	@Test
	public void mouse()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.ebay.com/");
		
		Actions mouse = new Actions(browser);
		mouse.moveToElement(browser.findElement(By.xpath("//*[@class='vl-flyout-nav__js-tab']//a[text()='Electronics']"))).perform();
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.
				elementToBeClickable
				(By.xpath("//a[text()='Computers and tablets']")));
		
		mouse.moveToElement(browser.findElement(By.xpath("//a[text()='Computers and tablets']"))).click().perform();
	}
	
	@Test
	public void mouse2()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		
		Actions mouse = new Actions(browser);
		mouse.moveToElement(browser.findElement(By.name("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
		}
	
	@Test
	public void dragandDrop()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/drag.xhtml");
		
		Actions mouse = new Actions(browser);
		//mouse.moveToElement(browser.findElement(By.id("form:drag_content"))).dragAndDrop(browser.findElement(By.id("form:drag_content")), browser.findElement(By.id("form:drop_content"))).perform();
		mouse.moveToElement(browser.findElement(By.id("form:conpnl_content"))).dragAndDropBy(browser.findElement(By.id("form:conpnl_content")), 170, 0).perform();
		mouse.moveToElement(browser.findElement(By.id("form:conpnl_content"))).dragAndDropBy(browser.findElement(By.id("form:conpnl_content")), -100, 0).perform();
	
	}
	
}
