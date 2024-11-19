package TestingBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	

	@Test
	public void dropdownimple()
	{
		WebDriver browser = new EdgeDriver();
		//maximize the borwser
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/select.xhtml");
		Select dropdown = new Select(browser.findElement(By.className("ui-selectonemenu")));
		dropdown.selectByIndex(2);
	
		dropdown.selectByVisibleText("Cypress");
		
		//dropdown.selectByValue("8");
		System.out.println(dropdown.isMultiple());
		
		//dropdown.
		
	}
}
