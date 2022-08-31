package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class LoginTest extends BaseClass {

	@Test(priority=1)
	public void loginBtn() throws Exception {
		// Mobile Element
		Thread.sleep(1000);
		MobileElement masukBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Masuk']"));
		masukBtn.click();

	}

	@Test(priority=2)
	public void loginEmptyUser() throws Exception {
		// Mobile Element
		Thread.sleep(1000);
		
		// login
		MobileElement masukBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Masuk']"));
		masukBtn.click();

		// alert
		MobileElement alertEmail = driver
				.findElement(By.xpath("//android.view.View[@content-desc='Email harus diisi']"));
		MobileElement alertPassword = driver
				.findElement(By.xpath("//android.view.View[@content-desc='Password harus diisi']"));

		// Assertion
		Assert.assertTrue(alertEmail.isDisplayed());
		Assert.assertTrue(alertPassword.isDisplayed());

	}

	@Test(priority=3)
	public void loginEmptyPassword() throws Exception {
		// Mobile Element
		Thread.sleep(1000);

		// email
		MobileElement userEmail = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
		userEmail.click();
		userEmail.sendKeys("destafajri@gmail.com");

		// login
		MobileElement masukBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Masuk']"));
		masukBtn.click();

		// alert
		MobileElement alertPassword = driver
				.findElement(By.xpath("//android.view.View[@content-desc='Password harus diisi']"));

		// Assertion
		Assert.assertTrue(alertPassword.isDisplayed());

	}

	@Test(priority=4)
	public void loginUnregisteredUser() throws Exception {
		// Mobile Element
		Thread.sleep(1000);

		// password
		MobileElement userPassword = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
		userPassword.click();
		userPassword.sendKeys("destafajri");

		// login
		MobileElement masukBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Masuk']"));
		masukBtn.click();

		// alert
		MobileElement alertUnregistEmail = driver
				.findElement(By.xpath("//android.view.View[@content-desc='Email yang Anda masukkan belum terdaftar']"));

		// Assertion
		Assert.assertTrue(alertUnregistEmail.isDisplayed());

	}

}
