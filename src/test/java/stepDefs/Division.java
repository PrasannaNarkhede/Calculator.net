package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.HelperMethod;

public class Division {
	WebDriver driver;
HelperMethod hp;
String  actRes;
String expRes;
@Test
public void f() {
  
hp.launchBrowser("chrome");
hp.openApp("https://www.calculator.net/");

hp.clickBtn(By.xpath("//span[contains(text(),'4')]"));
hp.clickBtn(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]"));
hp.clickBtn(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]"));
hp.clickBtn(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]"));

hp.clickBtn(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]"));

hp.clickBtn(By.xpath("//span[contains(text(),'2')]"));
hp.clickBtn(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]"));
hp.clickBtn(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]"));
actRes=hp.elementText(By.xpath("//div[@id='sciOutPut']")).trim();
System.out.println("Answer:"+actRes);
expRes="20"; 

Assert.assertEquals(actRes, expRes);
}

@BeforeTest
 public void setup() {
  hp=new HelperMethod(driver);
  
}

public static By getNumber(int num) {

  return By.xpath("//span[contains(text(),'"+num+"')]");
  
}
}