package tests;
import config.*;
//import log.Log4jFile;
import pages.*;
import utility_all.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseTest {

	ReadPropertyFile property=new ReadPropertyFile();
    
	@Test(dataProvider="guru99Login")
	public void test(String username,String password) throws Exception
	{
	//
		System.out.print(username+ " | " +password);
	//	System.out.println();
		Guru99_home.nameBox(driver).sendKeys(username);
		Guru99_home.password(driver).sendKeys(password);
		Guru99_home.submit(driver).click();
		Thread.sleep(3000);
	}
	
	@DataProvider(name="guru99Login")
	public Object[][]getData() throws Exception
	{
		String excelpath=property.getPropertyKey("testdata");
		Object[][] data=TestDataExcelReader.testData(excelpath,"login");
		return data;
		
	}
}
