package com.test.site;

import org.junit.Test;
import org.openqa.selenium.By;

import com.test.base.BaseTest;

public class HomePageTest3 extends BaseTest {
	@Test
	public void testMethodOne_3() throws Exception {
		
		System.out.println("ThreadName: " + Thread.currentThread().getName() + Thread.currentThread().getStackTrace()[1].getClassName());
//		waitForElement(By.id("com.android2.calculator3:id/cling_dismiss"), 30);
//		//WebElement el= driver.findElement(By.id("com.android2.calculator3:id/cling_dismiss"));
//		//highlightElement(driver, el);
//		driver.findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
//		driver.findElement(By.id("com.android2.calculator3:id/digit4")).click();
//		driver.findElement(By.id("com.android2.calculator3:id/minus")).click();
//		driver.findElement(By.id("com.android2.calculator3:id/digit9")).click();
//		driver.findElement(By.id("com.android2.calculator3:id/equal")).click();
//		//driver.close();
	}
}