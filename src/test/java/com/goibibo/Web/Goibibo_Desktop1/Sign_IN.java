package com.goibibo.Web.Goibibo_Desktop1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Sign_IN {
  @Test
  public void f() throws InterruptedException {
	  
	  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\devendra.gupta\\eclipse-workspace\\Goibibo_Desktop1\\Sign_in.html");
	    
      // create ExtentReports and attach reporter(s)
      ExtentReports extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
      
//      Appending to HtmlReporter

      

      
      
      
     

	System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
	
 WebDriver driver = new ChromeDriver();
      
  
  driver.manage().window().maximize();
  
  Thread.sleep(3000);
  
  ExtentTest test1 = extent.createTest("Goibibo Sign_In ", "Login in to Goibibo");
  
  test1.log(Status.PASS, "PASS");
  
  test1.log(Status.FAIL, "FAIL");

  
  test1.log(Status.INFO, "Starting test case");
  driver.get("https://www.goibibo.com");
  test1.pass("Navigate to goibibo");
extent.flush();
 
  
  Thread.sleep(3000);
	

  driver.findElement(By.id("get_sign_in")).click();
  test1.pass("Click on Sign IN");
  extent.flush();
  
  
  Thread.sleep(2000);
  
  

  driver.switchTo().frame("authiframe");
  test1.pass("Switch to frame");
  extent.flush();
  
  
 Thread.sleep(1000);
  

 driver.findElement(By.id("authMobile")).sendKeys("8858558819");
 test1.pass("Enter the mobile no.");
 extent.flush();
 
 
 Thread.sleep(1000);
 
 driver.findElement(By.xpath("//*[@id=\"mobileSubmitBtn\"]")).click();
 test1.pass("Click on continue button");
 extent.flush();
 
 
 Thread.sleep(2000);
 
 driver.findElement(By.id("authCredentialPassword")).sendKeys("8858558819");
  test1.pass("Enter the password");
  extent.flush();
  
 
 Thread.sleep(3000);
 
 driver.findElement(By.xpath("//*[@id=\"passwordEyeMobilePassword\"]")).click();
 test1.pass("click on password eye button");
 extent.flush();
 
 
 Thread.sleep(2000);
 
 driver.findElement(By.id("authCredentialPasswordSignInBtn")).click();
 test1.pass("Click on SignIn button");
 extent.flush();
 
 
 Thread.sleep(5000);
 
 driver.close();
 test1.pass("Close browser");
 extent.flush();
 
 
 test1.info("Test Completed");
 
 

 
 
 
// calling flush writes everything to the log file
 extent.flush();
}

}