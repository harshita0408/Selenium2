package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sel2_que_4 {
	
	public WebDriver driver;
@BeforeClass
    public void launchBrowser() {
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harshita Mishra\\eclipse-workspace\\selenium_project\\src\\main\\resources\\geckodriver.exe" );
	   WebDriver driver = new FirefoxDriver();
	   driver.get("https://demoqa.com/");
	   driver.manage().window().maximize();
}

@Test
public void dragAndDropTest() {
	driver.findElement(By.xpath("//h5[text()=\"Interactions\"]")).click();
	driver.findElement(By.xpath("//li[@class=\"btn btn-light \"][4]")).click();
	WebElement dragTo = driver.findElement(By.id("draggable"));
	WebElement dropTo = driver.findElement(By.id("droppable"));
	Actions actionelement = new Actions(driver);
	actionelement.dragAndDrop(dragTo, dropTo);
}

@AfterClass
    public void ClosingBrowser() 
    {
    driver.close();
    }


}
