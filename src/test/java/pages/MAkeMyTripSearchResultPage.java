package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Commons.CommonElements;



public class MAkeMyTripSearchResultPage {

	WebDriver driver;
	
	public MAkeMyTripSearchResultPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String GetsearchResult()
	{
		CommonElements.WaitforelementTobeVisible(driver, By.xpath("//*[@class='error-title']"));
		return CommonElements.GetText(driver.findElement(By.xpath("//*[@class='error-title']")));

	}
}
