package com.selenium.Cse1;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class D7_2 {
  int a=5,b=2,c;
	@Test(priority = 1)
  public void add() {
	 c=a+b;
	 Assert.assertEquals(c,7);
  }
	@Test(priority = 2)
	  public void subtract() {
		 c=a-b;
		 Assert.assertEquals(c,3);
	  }
	@Test(priority = 3)
	  public void multiply() {
		 c=a*b;
		 Assert.assertEquals(c,10);
	  }
	@Test(priority = 4)
	  public void divide() {
		 c=a/b;
		 Assert.assertEquals(c,2);
	  }
}
