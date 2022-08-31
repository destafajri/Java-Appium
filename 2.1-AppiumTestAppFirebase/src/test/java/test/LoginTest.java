package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class LoginTest extends BaseClass {

	@Test
	public void loginBtn() throws Exception {
		// Mobile Element
		Thread.sleep(1000);
		MobileElement masukBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Masuk']"));
		masukBtn.click();

	}
	
	@Test
	public void loginInvalid() throws Exception {
		// Mobile Element
		Thread.sleep(1000);
		
		//email
		MobileElement userEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
		userEmail.click();
		userEmail.sendKeys("destafajri@gmail.com");
		
		//password
		MobileElement userPassword = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
		userPassword.click();
		userPassword.sendKeys("destafajri");
		
		//login
		MobileElement masukBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Masuk']"));
		masukBtn.click();
		
		//alert
		MobileElement alert = driver.findElement(By.xpath("//android.view.View[@content-desc='Email yang Anda masukkan belum terdaftar']"));
		
		//Assertion
		Assert.assertTrue(alert.isDisplayed());

	}
	

}
