package TestingBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Synchronization {
	
	/*
	 * 3 types
	 * 1.implict wait - wait for visible
	 * 2.explict wait  - specific to a webelement
	 * 3.fluentwait
	 */
	
	@Test
	public void AmazonSearch()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.amazon.in/");
		
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		browser.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		browser.findElement(By.id("nav-search-submit-button")).click();
		
		/*WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.
				elementToBeClickable
				(By.xpath("(//*[@data-cy=\"title-recipe\"]//h2)[2]//a")));*/
		
		browser.findElement(By.xpath("(//*[@data-cy=\"title-recipe\"]//h2)[2]//a")).click();
	}

}
