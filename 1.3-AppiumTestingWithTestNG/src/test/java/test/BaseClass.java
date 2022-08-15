package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	static AppiumDriver<MobileElement> driver;

	
	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
			// device data

			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AOSP on IA Emulator");
			cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

	//		cap.setCapability(MobileCapabilityType.APP, "");
			cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);


	}
	
	@AfterSuite
	public void afterTest() {
		driver.close();
		driver.quit();
	}

}
