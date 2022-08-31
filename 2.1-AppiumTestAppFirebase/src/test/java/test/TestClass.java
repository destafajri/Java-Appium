package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class TestClass extends BaseClass{
	MobileElement masukBtn;
	
	public void loginElement() {
		//Mobile Element
		this.masukBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Masuk']"));
		
	}
	
	@Test
	public void testLogin() {
		masukBtn.click();
	}

}
