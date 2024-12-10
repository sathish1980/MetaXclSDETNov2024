package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Commons.CommonElements;



public class MakeMyTripSearchPage {
	
	WebDriver driver;
	
	public MakeMyTripSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void SelectFromLocation(String from)
	{
		//ClickFromLocationdropdown();
		SelectValueFromList(from);
	}
	
	public void SelectToLocation(String to)
	{
		//ClickToLocationdropdown();
		SelectValueFromList(to);
	}
	
	public void SelectDate(String expectedDate)
	{
		List<WebElement> allWeeks = driver.findElements(By.xpath("(//*[@class='DayPicker-Months']//div[@class='DayPicker-Month'])[last()]//div[@class='DayPicker-Week']"));
		for(WebElement eachWeek : allWeeks)
		{
			List<WebElement> allDaysInaWeek=	eachWeek.findElements(By.cssSelector("div[class^='DayPicker-Day']"));
			for (WebElement eachday : allDaysInaWeek)
			{
				
				String className = CommonElements.GetAttribute(eachday,"class");
				if(!(className.contains("outside")||className.contains("disabled")||className.contains("selected")))
				{
					String actualDate =CommonElements.GetText(eachday.findElement(By.tagName("p")));
					if(actualDate.equalsIgnoreCase(expectedDate))
					{
						CommonElements.ClickOnButton(eachday);
						return ;
					}
				}
			}
		}
	}
	
	public void clickOnSearchbutton()
	{
		CommonElements.WaitUntilClickable(driver, By.xpath("//a[text()='Search']"));
		CommonElements.ClickOnButton(driver.findElement(By.xpath("//a[text()='Search']")));

	}
	public void ClickFromLocationdropdown()
	{
		CommonElements.WaitUntilClickable(driver, By.cssSelector("[for='fromCity']"));
		WebElement from = driver.findElement(By.cssSelector("[for='fromCity']"));
		CommonElements.ClickOnButton(from);

	}
	
	public void ClickToLocationdropdown()
	{
		CommonElements.WaitUntilClickable(driver, By.cssSelector("[for='toCity']"));
		WebElement to = driver.findElement(By.cssSelector("[for='toCity']"));
		
		CommonElements.ClickOnButton(to);
	}
	
	public void SelectValueFromList(String selectValue)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='react-autowhatever-1']//li)[last()]")));
		
		List<WebElement> allcountry =driver.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
	
		for (WebElement eachElement : allcountry)
		{
			String Code = eachElement.findElement(By.cssSelector("div[class^='font14']")).getText();
			System.out.println(Code);
			if(Code.equalsIgnoreCase(selectValue))
			{
				eachElement.click();
				break;
			}
		}
	}
	
	
	public String GetSameCityError()
	{
		CommonElements.WaitforelementTobeVisible(driver, By.cssSelector("[data-cy='sameCityError']"));
		
		return CommonElements.GetText(driver.findElement(By.cssSelector("[data-cy='sameCityError']")));
	}

}
