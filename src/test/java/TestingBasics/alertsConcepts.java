package TestingBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class alertsConcepts {

	
	@Test
	public void radiobutton()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/alert.xhtml");
		browser.findElement(By.id("j_idt88:j_idt91")).click();
		Alert a = browser.switchTo().alert();
		a.accept();
		String output = browser.findElement(By.id("simple_result")).getText();
		System.out.println(output);
		
		browser.findElement(By.id("j_idt88:j_idt93")).click();
		Alert a1 = browser.switchTo().alert();
		a1.dismiss(); //to click cancel
		String output1 = browser.findElement(By.id("result")).getText();
		System.out.println(output1);
		
		browser.findElement(By.id("j_idt88:j_idt104")).click();
		Alert a2 = browser.switchTo().alert();
		a2.sendKeys("sathish");
		a2.accept();
		String output3 = browser.findElement(By.id("confirm_result")).getText();
		System.out.println(output3);
		
		
		browser.findElement(By.id("j_idt88:j_idt95")).click();
		
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.
				elementToBeClickable
				(By.id("j_idt88:j_idt98")));
		
		browser.findElement(By.id("j_idt88:j_idt98")).click();
		
	}
}
