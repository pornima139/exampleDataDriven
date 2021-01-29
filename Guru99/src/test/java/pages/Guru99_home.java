package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_home {


	//Access details to demo site.
	//User ID :	mngr303129
	//Password :	zUteduq
	//This access is valid only for 20 days.

	//	String path=System.getProperty("user.dir");
	//	System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
	//		WebDriver driver=new ChromeDriver();
	//		driver.get("http://www.demo.guru99.com/V4/");
	//		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr303129");
	//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zUteduq");
	//		Thread.sleep(3000);
	//		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	//		driver.quit();

	static WebElement element=null;
	
	public static WebElement nameBox(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@name='uid']"));
		return element;	
	}
	public static WebElement password(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@name='password']"));
		return element;	
	}
	public static WebElement submit(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@value='LOGIN']"));
		return element;	
	}
	public static WebElement reset(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@value='RESET']"));
		return element;	
	}
	

}
