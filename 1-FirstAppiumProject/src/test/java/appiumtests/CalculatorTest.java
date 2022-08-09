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
			
			//AOSP on IA
			// device data
			cap.setCapability("deviceName", "AOSP on IA Emulator");
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "9");
			
/*
 * Name: Calculator
Package: com.android.calculator2
Signature: f3:8a:b5:f3:f8:93:8c:5c:8c:84:79:4e:64:3d:e8:93:fd:c4:1b:18
Version name: 9
 Version Code: 28
 */
			// App data
			cap.setCapability("appPackage", "com.android.calculator2");
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
