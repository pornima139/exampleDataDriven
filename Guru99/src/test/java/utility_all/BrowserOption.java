package utility_all;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import config.ReadPropertyFile;

public class BrowserOption {

	static Logger log= LogManager.getLogger(BrowserOption.class);
	static String browser1;
	static WebDriver driver;
	//static ReadPropertyFile prop1=new ReadPropertyFile();

//	public static void main(String[] args) throws Exception {
//		getBrowser();
//	}
	//path=System.setProperty("user.dir");
	public static WebDriver getBrowser() throws Exception
	{
		browser1=ReadPropertyFile.getPropertyKey("browser");
		while(browser1==null)
		{
			log.fatal("browser not specified");
			System.exit(0);
		}
		if(browser1.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/Pornima/eclipse-workspace/Guru99/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			log.info("chrome browser is selected");
		}
		if(browser1.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pornima\\eclipse-workspace\\Guru99\\drivers\\chromedriver.exe");
			driver=new InternetExplorerDriver();
			log.info("ie browser is selected");
		}
		else
			log.info("specify correct option");
		return driver;
		
	}
	
}
