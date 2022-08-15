package test;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	@BeforeTest
	public void setup() {
		DesiredCapabilities cap = new DesiredCapabilities();
		// device data
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AOSP on IA Emulator");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		
		cap.setCapability(MobileCapabilityType.APP, "");

	}
	
	@AfterTest
	public void afterTest() {
		
	}

}
