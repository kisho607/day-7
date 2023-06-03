package com.selenium.Cse1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class D7C1 {
	WebDriver driver;
	@BeforeTest
  public void f() {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://google.com");
  }
  @Test
  public void f1() {
	  String txt=driver.getTitle();
	  System.out.println(txt);
	Assert.assertEquals(txt, "Google");
  }
  @AfterTest
  public void f2() {
	  driver.quit();
  }
}
