package Testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sel2_que_1 {
      public WebDriver driver;
      
      @BeforeClass
      public void launchBrowser() {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harshita Mishra\\eclipse-workspace\\selenium_project\\src\\main\\resources\\geckodriver.exe" );
	   WebDriver driver = new FirefoxDriver();
	   driver.get(" https://rahulshettyacademy.com/AutomationPractice/ ");
	   driver.manage().window().maximize();

      }
@Test(priority=1) 
public void fetchingAndDismiss() {
	driver.findElement(By.id("confirmbtn")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.dismiss();
}
@Test(priority=2)
public void enterDataonPopUp() {
	driver.findElement(By.id("name")).sendKeys("Harshita Mishra");
	driver.findElement(By.id("alertbtn")).click();
	Alert alert2 = driver.switchTo().alert();
	System.out.println(alert2.getText());
	alert2.accept();
}
@AfterClass
public void ClosingBrowser() {
driver.close();

}
}
