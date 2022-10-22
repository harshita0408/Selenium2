package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sel2_que_2 {
	public WebDriver driver;
@BeforeClass
    public void launchBrowser() {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harshita Mishra\\eclipse-workspace\\selenium_project\\src\\main\\resources\\geckodriver.exe" );
	   WebDriver driver = new FirefoxDriver();
	   driver.get("  https://rahulshettyacademy.com/dropdownsPractise/");
	   driver.manage().window().maximize();

    }
@Test(priority=1)
	public void Test() {
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		
	    driver.findElement(By.xpath("//a[@value=\"DEL\"]"));
		
		driver.findElement(By.xpath("(//a[@value=\"BOM\"])[2]")).click();
		//driver.findElement(By.cssSelector("Ii-state-default.ui-state-highlight.ui-state-active")).click();
	}
	
@Test(priority=2)
	public void Passenger_Search() {
		driver.findElement(By.id("divpaxinfo")).click();
		//adding two adults
		for(int i=0; i<2; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.xpath("//input[@value=\"Done\"]")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
	
@AfterClass
    public void closeBrowser() {
    driver.close();
    }
    
}
