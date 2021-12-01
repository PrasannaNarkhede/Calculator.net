package stepDefs;

import org.testng.annotations.Test;
import util.HelperMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Substract {
	WebDriver driver;
	HelperMethod hm;
	String actRes;
	String  expRes;

  @Test
  public void substraction() {
	  hm.launchBrowser("chrome");
	  hm.openApp(" https://www.calculator.net/");
	
	  hm. clickBtn(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[1] "));
	  hm. clickBtn(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[2] "));
	  hm. clickBtn(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[3]"));
 
	  hm. clickBtn(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[4]"));
	  
	  hm. clickBtn(By.xpath(" /html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[1]"));
	  hm. clickBtn(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[2] "));
	  hm. clickBtn(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[3]"));
	  actRes=hm.elementText(By.xpath(" //div[@id='sciOutPut']")).trim();
	
	  System.out.println("Answer" +actRes);
	  expRes="333";
	  
	  Assert.assertEquals(actRes,expRes);
  }
  @BeforeMethod
  public void beforeMethod() {
	  hm= new HelperMethod(driver);
  }
 public static By getnumber(int num)
 {
	 return By.xpath("//span[contains(text(),'\"+num+\"')]");
	 
 }
  @AfterMethod
  public void afterMethod() {
  }

}
