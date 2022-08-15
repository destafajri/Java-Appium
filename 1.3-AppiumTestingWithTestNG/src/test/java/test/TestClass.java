package test;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	
	@Test
	public void testOne() {
		try {
			driver.get("https://google.com");	
		}catch(WebDriverException e) {
			
		}
		
	}

}
