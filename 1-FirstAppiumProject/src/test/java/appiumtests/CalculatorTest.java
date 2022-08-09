package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}

	}

	public static void openCalculator() {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();

			// device data
			cap.setCapability("deviceName", "ASUS_Z01QD");
			cap.setCapability("udid", "127.0.0.1:21503");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "7.1.2");

			// App data
			cap.setCapability("appPackage", "com.google.android.calculator");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);

			System.out.println("App Started....");
		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();

		}

	}

}
