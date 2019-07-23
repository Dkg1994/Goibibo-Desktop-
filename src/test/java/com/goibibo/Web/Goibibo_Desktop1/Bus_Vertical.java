package com.goibibo.Web.Goibibo_Desktop1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Bus_Vertical {
	 @Test
	  public void f() throws InterruptedException {
		  
			
		  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Program Files (x86)\\Jenkins\\workspace\\Maven Project (Desktop)\\test-output\\Bus.html");
		    
	      // create ExtentReports and attach reporter(s)
	      ExtentReports extent = new ExtentReports();
	      extent.attachReporter(htmlReporter);
	      
	      
	      ExtentTest test1 = extent.createTest("Goibibo Bus_Vertical", "Check Flow of Bus");
			
			
	System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver_win32\\chromedriver.exe");
			


	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	      test1.log(Status.INFO,"Starting test case");
	      driver.get("https://www.goibibo.com");
	      test1.pass("Go to Goibibo");
	      extent.flush();
	      
	      
//		------------------ Click On Bus Icon --------------------------------	
			
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[4]/a/i")).click();
			test1.pass("Click Bus Icon");
			extent.flush();
			
			Thread.sleep(2000);
			
//			------------------------------GO To Source point----------------------------------
			
			WebElement testDropDown = driver.findElement(By.id("gi_source"));
			
			testDropDown.sendKeys("Delhi");
			test1.pass("Enter the Source name");
			extent.flush();
			
		driver.findElement(By.xpath("//*[@id=\"gi_source_wrapper\"]/div/ul/li[1]")).click();
		
		Thread.sleep(2000);
		test1.pass("Click on location from Drop down");
		extent.flush();

//		-----------------------------------------Go to Destination Point-------------------

	WebElement testDrop =	driver.findElement(By.id("gi_destination"));


	testDrop.sendKeys("Agra");
	test1.pass("Enter the Destination name");
extent.flush();


	Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"gi_destination_wrapper\"]/div/ul/li[1]")).click();
		test1.pass("Click on location from Dropdown option");
		extent.flush();
//		---------------------------------------Select the Date---------------------------------
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("gi_onward_text")).click();
		test1.pass("Click on Date");
		extent.flush();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"jrdp_start-calen_nextmonth_multi_1\"]")).click();
		test1.pass("Click on next month");
		extent.flush();
		
		
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//*[@id=\"jrdp_start-calen_8_4_2019\"]")).click();
	test1.pass("Click on date 29");
	extent.flush();
	
	
	Thread.sleep(2000);

	//------------------------------------------Search Button-------------------------------------

	driver.findElement(By.id("gi_search_btn")).click();
	test1.pass("Search button");
	extent.flush();


	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"opliner\"]/span/span")).click();
	test1.pass("Select Bus operator");
	extent.flush();
	
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("//label[contains(text(),'Northern Travels')]")).click();
	test1.pass("Choose operator from Bus operator filter");
	extent.flush();
	
	Thread.sleep(2000);


	//-------------------------Click On Book button for Selecting the seat-----------------------

	driver.findElement(By.xpath("//*[@id=\"cp\"]")).click();
	test1.pass("Click on can.policy from SRP page");
	extent.flush();
	
	Thread.sleep(5000);

	driver.findElement(By.linkText("Cancellation Policy")).click();
	test1.pass("Click on Cancellation policyfrom popup");
	extent.flush();
	
	Thread.sleep(5000);

	driver.findElement(By.linkText("Seat Layout")).click();
	test1.pass("Click on Seat Layout");
	extent.flush();
	
	driver.findElement(By.className("availableSeat")).click();
	test1.pass("Click on  seats");
	extent.flush();
	
	
	Thread.sleep(1000);


	driver.findElement(By.xpath("//option[contains(text(),'Anand Vihar  -  10:30')]")).click();
	test1.pass("Select Borading point");
	Thread.sleep(2000);
	extent.flush();

	driver.findElement(By.id("confirm")).click();
	test1.pass("Click on confirm booking");
	extent.flush();
	
	
	driver.findElement(By.linkText("Cancellation Policy")).click();
	
	test1.pass("Click on Cancellation policy");
	extent.flush();
	
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"go_fareRulespopUp\"]/div/a")).click();
	test1.pass("Close Cancellation policy");
	extent.flush();
	
	Thread.sleep(2500);

	driver.findElement(By.xpath("//*[@id=\"adultchoose1\"]/option[2]")).click();
	test1.pass("Choose Mr.&Mrs.");
	extent.flush();
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"adultfirstname1\"]")).sendKeys("Test");
	test1.pass("Enter First name");
	extent.flush();
	
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"adultlastname1\"]")).sendKeys("Booking");
	test1.pass("Enter Last name");
	extent.flush();
	
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"adultage1\"]")).sendKeys("25");
	test1.pass("Enter age");	
	extent.flush();

	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testnoc009@gmail.com");
	test1.pass("Enter Mail id");
	extent.flush();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
	test1.pass("Enter Mobile No.");
	extent.flush();
	
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"makePayment\"]")).click();
	test1.pass("Make Payment");
	extent.flush();
	
	Thread.sleep(11000);

	driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]")).click();
	test1.pass("Click on Netbanking");
	extent.flush();
	
	Thread.sleep(1000);

	driver.findElement(By.xpath("//option[contains(text(),'AXIS Bank (AXIS)')]")).click();
	test1.pass("Select Bank");
	extent.flush();

	driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
	test1.pass("Click Paynow button");
	extent.flush();
	
	Thread.sleep(5000);

	driver.close();
	test1.pass("Close Browser");
	test1.info("Test Completed");
	

	//calling flush writes everything to the log file
	extent.flush();

		}	

	}
