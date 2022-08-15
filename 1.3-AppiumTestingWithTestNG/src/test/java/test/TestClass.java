package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class TestClass extends BaseClass{
	
	@Test
	public void testOne() {
		//Mobile Element
		MobileElement one = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
		MobileElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		MobileElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		MobileElement four = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
		MobileElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
		MobileElement six = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
		MobileElement seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
		MobileElement eight = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
		MobileElement nine = driver.findElement(By.id("com.android.calculator2:id/digit_9"));
		MobileElement zero = driver.findElement(By.id("com.android.calculator2:id/digit_0"));
		MobileElement add = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		MobileElement minus = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
		MobileElement multiple = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
		MobileElement div = driver.findElement(By.id("com.android.calculator2:id/op_div"));
		MobileElement del = driver.findElement(By.id("com.android.calculator2:id/del"));
		MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
		MobileElement formulaScrn = driver.findElement(By.id("com.android.calculator2:id/formula"));
		MobileElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
		
		//actions sample
		one.click();
		add.click();
		five.click();
		equals.click();
		
		Assert.assertEquals(result.getText(), "6");

		
	}

}
