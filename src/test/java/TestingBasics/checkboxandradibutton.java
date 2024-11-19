package TestingBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class checkboxandradibutton {
	
	@Test
	public void radiobutton()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/radio.xhtml;");
		browser.findElement(By.xpath("(//*[text()='Firefox']//parent::td//div[starts-with(@class,'ui-radiobutton-')])[1]")).click();
		browser.quit();
	}
	
	@Test
	public void checkbox()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/checkbox.xhtml;");
		browser.findElement(By.xpath("//*[@id='j_idt87:j_idt91']//div[starts-with(@class,'ui-chkbox-box')]")).click();
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.
				elementToBeClickable
				(By.className("ui-growl-title")));
		String text1 =browser.findElement(By.className("ui-growl-title")).getText();
		System.out.println(text1);
		browser.findElement(By.xpath("//*[@id='j_idt87:j_idt91']//div[starts-with(@class,'ui-chkbox-box')]")).click();
		wait.until(ExpectedConditions.
				elementToBeClickable
				(By.className("ui-growl-title")));
		String text2 =browser.findElement(By.className("ui-growl-title")).getText();
		System.out.println(text2);
		
		browser.findElement(By.className("ui-toggleswitch-slider")).click();
		wait.until(ExpectedConditions.
				elementToBeClickable
				(By.className("ui-growl-title")));
		String text3 =browser.findElement(By.className("ui-growl-title")).getText();
		System.out.println(text3);
	}

}
