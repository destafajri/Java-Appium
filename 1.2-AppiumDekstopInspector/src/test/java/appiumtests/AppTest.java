package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppTest {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openApp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}

	}

	public static void openApp() {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();

			// device data
			cap.setCapability("deviceName", "AOSP on IA Emulator");
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "9");

			// App data
			cap.setCapability("appPackage", "com.android.calculator2");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);
			
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
			MobileElement min = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
			MobileElement multiple = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
			MobileElement div = driver.findElement(By.id("com.android.calculator2:id/op_div"));
			MobileElement del = driver.findElement(By.id("com.android.calculator2:id/del"));
			MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
			
			//actions sample
			one.click();
			min.click();
			five.click();
			equals.click();


			System.out.println("App Started....");
		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();

		}

	}

}
