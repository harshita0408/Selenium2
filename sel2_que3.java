package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sel2_que3 {

	public WebDriver driver;
@BeforeClass
    public void launchBrowser() {
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harshita Mishra\\eclipse-workspace\\selenium_project\\src\\main\\resources\\geckodriver.exe" );
	   WebDriver driver = new FirefoxDriver();
	   driver.get(" https://www.amazon.in/");
	   driver.manage().window().maximize();

    }
@Test(priority = 1)
public void verifyTheUrl() {
	// Verify the homePage url & current title page
	String currentUrl = driver.getCurrentUrl();
	String expectedUrl = "https://www.amazon.in/";
	try {
		Assert.assertEquals(currentUrl, expectedUrl);
	} catch (Exception e) {
		System.out.println("-- mismatched--");
	}
	String actualTitle = driver.getTitle();
	String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	try {
		Assert.assertEquals(actualTitle, expectedTitle);
	} catch (Exception e) {
		System.out.println("Mismatched the url");
	}
}

@Test(priority=2)
public void verifyLogo() {
	
}

@AfterClass
      public void ClosingBrowser() {
	  driver.close();
}


}
