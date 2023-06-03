package com.selenium.Cse1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class D7_4 {
	WebDriver driver;
	@BeforeTest
	public void bt() throws Exception
	{
		 WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	}
		
	@Test()
	  public void f() throws Exception {
		//username
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		//pwd
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		//click login btn
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
	  }
	
	@Test(dependsOnMethods = "f")
	  public void f1() throws Exception {
		Thread.sleep(3000);
		//profile btn click
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
		Thread.sleep(3000);
		//logout btn click
		driver.findElement(By.linkText("Logout")).click();
		//checking for logout
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }

	@AfterTest
	public void at() 
	{
		//driver.quit();
	}
}
