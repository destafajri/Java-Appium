package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class TestClass extends BaseClass {

	@Test(priority=1)
	public void onBoardingPage() throws Exception {
		Thread.sleep(1000);
		// Mobile Element
		MobileElement GabungSekarangBtn = driver.findElement(By.id("com.tokopedia.tkpd.df_base:id/buttonGlobalDynamicOnbaording"));
		MobileElement LewatiSekarangBtn = driver.findElement(By.id("com.tokopedia.tkpd.df_base:id/skipDynamicOnbaording"));
		MobileElement SelanjutnyaBtn = driver.findElement(By.id("com.tokopedia.tkpd.df_base:id/nextDynamicOnbaording"));
		
		//Assert
		assertTrue(GabungSekarangBtn.isDisplayed());
		assertTrue(LewatiSekarangBtn.isDisplayed());
		assertTrue(SelanjutnyaBtn.isDisplayed());

	}
	
	@Test(priority=2)
	public void homePage() throws Exception {
		// Mobile Element
		MobileElement LewatiBtn = driver.findElement(By.id("com.tokopedia.tkpd.df_base:id/skipDynamicOnbaording"));
		LewatiBtn.click();
		
		Thread.sleep(1000);
		MobileElement HomeBtn = driver.findElement(By.id("com.tokopedia.tkpd:id/menu_home"));
		//Assert
		assertTrue(HomeBtn.isDisplayed());

	}
	

}
