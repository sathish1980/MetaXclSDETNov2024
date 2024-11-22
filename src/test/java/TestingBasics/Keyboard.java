package TestingBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard {

	
	@Test
	public void keyboardactions()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		
		Actions keyboard = new Actions(browser);
		keyboard.moveToElement(browser.findElement(By.name("email"))).sendKeys("sathish").perform();
		keyboard.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		}
	
	@Test
	public void keyboardactions2() throws AWTException
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		
		Actions keyboard = new Actions(browser);
		keyboard.moveToElement(browser.findElement(By.name("email"))).sendKeys("sathish").doubleClick().perform();
		
		Robot keyboard2 = new Robot();
		keyboard2.keyPress(KeyEvent.VK_CONTROL);
		keyboard2.keyPress(KeyEvent.VK_X);
		keyboard2.keyRelease(KeyEvent.VK_CONTROL);
		keyboard2.keyRelease(KeyEvent.VK_X);
		keyboard2.keyPress(KeyEvent.VK_TAB);
		keyboard2.keyRelease(KeyEvent.VK_TAB);
		keyboard2.keyPress(KeyEvent.VK_CONTROL);
		keyboard2.keyPress(KeyEvent.VK_V);
		keyboard2.keyRelease(KeyEvent.VK_CONTROL);
		keyboard2.keyRelease(KeyEvent.VK_V);
		}
	
	
}
