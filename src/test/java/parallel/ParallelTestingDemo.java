package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestingDemo 
{

	WebDriver driver=null;
	
	@Parameters("browser")
	@BeforeClass
	public void luanchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/guru99home/");
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/guru99home/");
		}
		
	}
	
	@Test
	public void clickSeleniumOption()
	{
		driver.findElement(By.xpath("//tbody//tr//td//a[contains(text(),'Selenium')]")).click();
	}

	
	
}//class close
