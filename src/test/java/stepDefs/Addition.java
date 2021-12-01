package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.HelperMethod;

public class Addition {
	WebDriver driver;
	HelperMethod hp;
	String  actRes;
	String expRes;
  @Test
  public void addition() {
	  driver.get("https://www.calculator.net/");
		
		
		
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'+')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		expRes = "555";
		actRes = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText().trim();
		System.out.println(actRes);
		Assert.assertEquals(expRes, actRes);
	}
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	 
  }
}
