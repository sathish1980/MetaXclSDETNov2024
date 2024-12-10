package Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.ExcelfileRead;

public class DataProviderDetails {
	
	@DataProvider
	public Object[][] GetValidSearchTestData() throws IOException
	{
		return ExcelfileRead.ExcelRead("ValidSearch");
	}
	
	@DataProvider
	public Object[][] GetSameCitySearchTestData() throws IOException
	{
		return ExcelfileRead.ExcelRead("SameCitySearch");
	}

}
