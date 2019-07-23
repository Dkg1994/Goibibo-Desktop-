package com.goibibo.Web.Goibibo_Desktop1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Car_Vertical {
	 @Test
	  public void f() throws InterruptedException {
		  
		  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Program Files (x86)\\Jenkins\\workspace\\Maven Project (Desktop)\\test-output\\Car_Vertical.html");
		    
	      // create ExtentReports and attach reporter(s)
	      ExtentReports extent = new ExtentReports();
	      extent.attachReporter(htmlReporter);
	      
	      
	      ExtentTest test1 = extent.createTest("Goibibo Car_Vertical ", "Check Flow of Car");
	  
		System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        test1.log(Status.INFO, "Starting test case");
	        driver.get("https://www.goibibo.com");
	        test1.pass("Go to Goibibo");
	        extent.flush();
	        
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	        
	        

		
//	        --------------------------------------------- Click on Car Icon-----------------------
	        
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[6]/a/i")).click();
	        test1.pass("Click on Car icon");
	        extent.flush();
	        
	        Thread.sleep(1000);
	//  ----------------------------------------Click on Source Point--------------------------------
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[1]/div[1]/div/p")).click();
	        test1.pass("Click on Source Station");
	        extent.flush();
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Delhi");
	        test1.pass("Enter Source Name");
	        extent.flush();
	        
			driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
			test1.pass("Click the city from dropdown ");
			extent.flush();
			
//			--------------------------------------Click on Destination Point----------------------------------------
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[1]/div[2]/div/p")).click();
			test1.pass("Click on Destination ");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Agra");
			test1.pass("Enter the Destination name");
			extent.flush();
			
			driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
			test1.pass("Click on Destination from Dropdown");
			extent.flush();
				Thread.sleep(500);
//			-----------------------------------------Click On Search Button------------------------------------
				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[3]/button")).click();
			test1.pass("Search Cabs");
			extent.flush();
//			--------------------------------Click on Icon on Review page----------------------
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[2]/label/p[1]")).click();
			test1.pass("SEDAN cabs");
			extent.flush();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[3]/label")).click();
			test1.pass("SUV Cabs");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[1]/label")).click();
			test1.pass("HATHBACK Cabs");
			extent.flush();
			Thread.sleep(1000);
			
//			---------------------------------- Go to  Travellar Details-------------------------
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/div[2]/section[2]/div[1]/span[2]")).click();
			test1.pass("Click on Add Traveller button");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[1]/div[2]/div/label[1]/span")).click();
			test1.pass("Click on Title");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[1]/div[3]/input")).sendKeys("Test");
			test1.pass("Enter  Name");
			extent.flush();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[2]/p/input")).sendKeys("9999999999");
			test1.pass("Enter Mobile No.");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[3]/p/input")).sendKeys("testnoc009@gmail.com");
			test1.pass("Enter Email Id");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[5]/p/button")).click();
			test1.pass("Click on Continue Button");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[2]/div[3]/div[2]/p[2]/span")).click();
			test1.pass("Click on Fare Details");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/div[1]/div/div[3]/span")).click();
			test1.pass("Click on Got it");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[3]/div[2]/button")).click();
			test1.pass("Pay button");
			extent.flush();
			Thread.sleep(6000);

			driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]/span")).click();
			test1.pass("Click on Netbanking");
			extent.flush();
			
			driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[6]")).click();
			test1.pass("Selct Bank");
			extent.flush();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
			test1.pass("Click on Pay button");
			extent.flush();
			
			Thread.sleep(2000);
			
			driver.close();
			
			 driver.quit();
				test1.pass("Close browser");
				 
				 test1.info("Test Completed");
				 
				// calling flush writes everything to the log file
				 extent.flush();
		}
		
		

	}
