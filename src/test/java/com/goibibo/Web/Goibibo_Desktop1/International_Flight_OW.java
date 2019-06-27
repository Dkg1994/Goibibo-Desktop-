package com.goibibo.Web.Goibibo_Desktop1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class International_Flight_OW {
  @Test
  public void f() throws InterruptedException {

	  

		System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
		
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.goibibo.com");
      
      driver.manage().window().maximize();
      
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
      driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[1]/a/i")).click();
      
      Thread.sleep(2000);
      
      WebElement listbox = driver.findElement(By.xpath("//*[@id=\"gosuggest_inputSrc\"]"));
      
      listbox.sendKeys("D");
      
      Thread.sleep(3000);
      
    
      driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
      
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("//*[@id=\"gosuggest_inputDest\"]")).sendKeys("Singapore");
      
      Thread.sleep(3000);
      
      driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
   
//      To click on date picker
      
      driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[1]/span")).click();                
      
      Thread.sleep(1000);
      
//      To select date
      
      driver.findElement(By.xpath("//*[@id=\"fare_20190727\"]")).click();
      
      
//    To click on search button
    
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//*[@id=\"gi_search_btn\"]")).click();
    
    Thread.sleep(5000);
  
//      
////    To check airlines filters.
//    
//driver.findElement(By.xpath("//*[@id=\"airlinesFilter\"]/span/i[2]")).click();
//
//Thread.sleep(4000);
//
////Click on Air-india from airline filter
//
//driver.findElement(By.xpath("//*[@id=\"sticky\"]/div/ul/li[4]/ul/li[2]/span[1]/label")).click();
//
//Thread.sleep(3000);
//
//
//
//Select Stoppage filter

driver.findElement(By.xpath("//*[@id=\"stopsFilter\"]/span/i[2]")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"sticky\"]/div/ul/li[3]/ul/div/li[2]/span[1]/label")).click();

//Thread.sleep(3000);

//To click on book button
    
 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[4]/div/div[4]/div[2]/div[2]/div[2]/div/span[1]/span/input")).click();
 
 Thread.sleep(7000);
 
// To click on Baggage & fare rule button on review page
 
driver.findElement(By.linkText("Baggage and Fare Rules")).click();

Thread.sleep(2000);

//Click on Fare Rule from popup

driver.findElement(By.linkText("Fare Rules")).click();

Thread.sleep(1000);

//Close Baggage & fare popup window

driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/a")).click();

Thread.sleep(1000);
 
//Select Mr. from trveller details

 WebElement option = driver.findElement(By.xpath("//*[@id=\"Adulttitle1\"]"));
 
 option.sendKeys(Keys.DOWN);
 
 option.sendKeys(Keys.ENTER);
 
 Thread.sleep(1000);
 
// Input First name
 
 driver.findElement(By.xpath("//*[@id=\"AdultfirstName1\"]")).sendKeys("Devendra");
 
 Thread.sleep(1000);
 
// Input Last Name
 
 driver.findElement(By.xpath("//*[@id=\"AdultlastName1\"]")).sendKeys("Gupta");
 
 Thread.sleep(1000);
 
// Input Email Id
 
 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testnoc009@gmail.com");
 
 Thread.sleep(1000);
 
// Input Mobile No.
 
 driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
 
 Thread.sleep(6000);
 
// Click on Proceed to Payment button
 
 
 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/button")).click();
 
 Thread.sleep(8000);
 
// Click on Net banking option
 
 driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]")).click();
 
 Thread.sleep(2000);
 
// Click on bank which we want to test
 
 driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[4]")).click();
 
 Thread.sleep(2000);
 
// Click on paynow button
 
 driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
 
 Thread.sleep(4000);
 
 driver.close();
 

	}

}
