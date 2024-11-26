package TestingBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTable {

	String expectedCountry = "Germany";
	@Test
	public void WH() throws InterruptedException
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/table.xhtml");
		
		List<WebElement> allPages = browser.findElements(By.xpath("//*[@class='ui-paginator-pages']//a"));
		
		for (int j=1;j<=allPages.size();j++)
		{
			browser.findElement(By.xpath("//*[@class='ui-paginator-pages']//a["+j+"]")).click();
			Thread.sleep(3000);
		
		List <WebElement> allRows = browser.findElements(By.xpath("//tbody[@id='form:j_idt89_data']//tr"));
		for(int i=1;i<allRows.size();i++)
		{
			String actualCountry  = browser.findElement(By.xpath("//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[2]//span[starts-with(@style,'vertical')]")).getText();
			if(expectedCountry.equalsIgnoreCase(actualCountry))
			{
				String name = browser.findElement(By.xpath("//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[3]//span[starts-with(@style,'vertical')]")).getText();
				System.out.println(name);
			}
		}
		}
		
	}
}
