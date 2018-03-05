package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class report {
	

	 public static WebDriver driver;
	 public static Dimension size;
	  static String URL="https://www.definitivehc.com/free-trial";
	
	
	
  @Test (priority=1)
  public void url() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun\\workspace\\medical\\drivers\\chromedriver.exe");
	  	 ChromeOptions options = new ChromeOptions();
	  	 options.addArguments("--start-maximized");
	  	 driver = new ChromeDriver( options );
	  	 driver.get(URL);
	  	Thread.sleep(3000);
	  
  }
  
  @Test (priority=2)
  public void signup() throws InterruptedException {
  
	  WebElement getmenu= driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div/span/div/ul/li[1]/a"));
	   Actions act = new Actions(driver);
	   act.moveToElement(getmenu).perform();
	   Thread.sleep(3000);
	  
	   driver.findElement(By.xpath("//*[@id=\'hs_menu_wrapper_module_13884994340213\']/ul/li[1]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		
	   
	   
	   
	   
	   
	driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/span/div/form/div[1]/div/input")).sendKeys("test");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/span/div/form/div[2]/div/input")).sendKeys("report");
	Thread.sleep(3000);
	
	
	 driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/span/div/form/div[4]/div/input")).sendKeys("test");
		Thread.sleep(3000);
	 

}
  
  @Test (priority=3)
  public void test() {
	  
	  String sValue = "Lakshay Sharma";
 
	  System.out.println(" What is your full name");
 
	  Assert.assertEquals("Lakshay Sharma", sValue);
 
	  System.out.println(sValue);
 
  }
  

}
