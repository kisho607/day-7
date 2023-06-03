package com.selenium.Cse1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class D7C5 {
  @Test(groups= {"SmokeTest"})
  public void Test1() throws Exception {
	  WebDriverManager.chromedriver().setup();
		WebDriver  driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String t1=driver.getTitle();
		System.out.println(t1);
		Assert.assertEquals(t1, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
		String u1=driver.getCurrentUrl();
		Assert.assertEquals(u1,"https://www.godaddy.com/en-in");
		driver.quit();
  }
  @Test(groups= {"RegressionTest"})
  public void Test2() throws Exception {
	  WebDriverManager.chromedriver().setup();
		WebDriver  driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//domain btn click
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		//Domain Name Search link text
		driver.findElement(By.linkText("Domain Name Search")).click();
  }
  @Test(groups= {"SmokeTest"})
  public void Test3() throws Exception {
	  	System.out.println("in smoke test");
  }
  @Test(groups= {"RegressionTest"})
  public void Test4() throws Exception {
	  	System.out.println("in RegressionTest");
  }
}
