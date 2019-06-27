package com.goibibo.Web.Goibibo_Desktop1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Dom_Hotel {
  @Test
  public void f() throws InterruptedException {

	  
		
	  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("D:\\Reports\\Dom_Hotel.html");
	    
      // create ExtentReports and attach reporter(s)
      ExtentReports extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
      
      
      ExtentTest test1 = extent.createTest("Goibibo Dom_Hotel", "Check Flow of Hotel");
	  
		
		
System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
	
  WebDriver driver = new ChromeDriver();
  
  driver.manage().window().maximize();
  
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  
  test1.log(Status.INFO, "Starting the test case");
  driver.get("https://www.goibibo.com");
  test1.pass("Go to Goibibo");
  
  
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[2]/a/i")).click();
	test1.pass("Click on Hotel Icon");

	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Fatehabad");
	test1.pass("Enter the City Name");

	Thread.sleep(2000);
	
	 driver.findElement(By.id("react-autosuggest-1-suggestion--1")).click();
	test1.pass("Click on city via Dropdown option");
	 
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"Home\"]/div[3]/div[1]/div/div[1]/div[3]/div/div[3]/div/button")).click();
test1.pass("Click on Search button");

Thread.sleep(2000);

driver.findElement(By.linkText("The Ganga")).click();
test1.pass("Click on Hotels");

Thread.sleep(5000);

//------------------------------ To Switch in other Tab---------------------------

//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

driver.switchTo().window(tabs.get(1));
test1.pass("Switch to other Tab");

//-------------------------------Click on Book Now Button------------------------

Thread.sleep(3000);


driver.findElement(By.linkText("Book Now")).click();
test1.pass("Click on Book Now button");

Thread.sleep(2000);

driver.findElement(By.linkText("Booking & Cancellation Policy")).click();
test1.pass("Click on Booking & Cancellation policy");

Thread.sleep(1500);

driver.findElement(By.xpath("//*[@id=\"go_cp_popCont\"]/div/a")).click();
test1.pass("Close popup");

Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"choose\"]/option[1]")).click();
test1.pass("Choose Mr & Mrs");
Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"firstname1\"]")).sendKeys("Test");
test1.pass("Enter First Name");
Thread.sleep(1000);

driver.findElement(By.id("lastname1")).sendKeys("Bookings");
test1.pass("Enter Last Name");
Thread.sleep(1000);

driver.findElement(By.id("email")).sendKeys("testnoc009@gmail.com");
test1.pass("Enter Email ");
Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
test1.pass("Enter Mobile no.");
Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"travellerForm\"]/div[14]/div[2]")).click();
test1.pass("Click on Pay button");

Thread.sleep(20000);

driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]")).click();
test1.pass("Select netbanking");

Thread.sleep(1000);

driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[7]")).click();
test1.pass("Choose Bank");

driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
test1.pass("Make Payment");

Thread.sleep(5000);

driver.close();
test1.pass("Close Browser");
test1.info("Test Completed");


//calling flush writes everything to the log file
extent.flush();

}



}
