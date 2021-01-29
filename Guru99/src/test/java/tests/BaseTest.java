package tests;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.*;
import utility_all.*;

public class BaseTest {

//	Logger logger=LogManager.getLogger(BaseTest.class);
	ReadPropertyFile prop2=new ReadPropertyFile();
	BrowserOption Opt=new BrowserOption();
	protected WebDriver driver=null;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		String url=prop2.getPropertyKey("url");
		driver=Opt.getBrowser();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//logger.info("mavigated");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
