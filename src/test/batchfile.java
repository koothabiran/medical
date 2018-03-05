package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class batchfile {
	
	public static WebDriver driver;
	 public static Dimension size;
	  static String URL="http://www.store.demoqa.com";
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun\\workspace\\medical\\drivers\\chromedriver.exe");
	  	 ChromeOptions options = new ChromeOptions();
	  	 options.addArguments("--start-maximized");
	  	 driver = new ChromeDriver( options );
	  	 driver.get(URL);
	  	Thread.sleep(3000);
	  
  }
  
  @Test 
  public void test1() {
  
	 
	  
      // Here driver will try to find out My Account link on the application
 
      WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));
 
      //Test will only continue, if the below statement is true
 
      //This is to check whether the link is displayed or not
 
      Assert.assertTrue(myAccount.isDisplayed());
 
      //My Account will be clicked only if the above condition is true
 
      myAccount.click();
  
  
  }  
  
  //Assert failed condition
  @Test 
  public void test2() {
  
	  driver.get("http://www.store.demoqa.com");
	  
      // Here driver will try to find out My Account link on the application
 
      WebElement myAccount = driver.findElement(By.xpath("html/body/div[2]/div/div/header/div[1]/a"));
 
      //Test will only continue, if the below statement is true
 
      //This is to check whether the link is displayed or not
 
      Assert.assertFalse(myAccount.isDisplayed());
 
      //My Account will be clicked only if the above condition is true
 
      myAccount.click();
  
      driver.findElement(By.xpath("html/body/div[2]/div/div/header/div[2]/a")).click();
  
  }  
  
}
