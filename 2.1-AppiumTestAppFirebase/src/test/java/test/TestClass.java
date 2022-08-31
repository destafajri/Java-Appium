package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class TestClass extends BaseClass {

	@Test
	public void loginBtn() throws Exception {
		// Mobile Element
		Thread.sleep(1000);
		MobileElement masukBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Masuk']"));
		masukBtn.click();

	}

}
