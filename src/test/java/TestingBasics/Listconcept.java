package TestingBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Listconcept {

	
	@Test
	public void listimple()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/select.xhtml");
		
		browser.findElement(By.xpath("//*[@id='j_idt87:country']//div[starts-with(@class,'ui-selectonemenu-trigger')]")).click();
		
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.
				elementToBeClickable
				(By.xpath("//*[@id='j_idt87:country_items']//li[last()]")));
		
		List<WebElement> allcountry =browser.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
	
		for(int i=1;i<=allcountry.size();i++)
		{
			String countries = browser.findElement(By.xpath("//*[@id='j_idt87:country_items']//li["+i+"]")).getText();
			System.out.println(countries);
			if(countries.equalsIgnoreCase("Germany"))
			{
				browser.findElement(By.xpath("//*[@id='j_idt87:country_items']//li["+i+"]")).click();
				break;
			}
		}
	}
}
