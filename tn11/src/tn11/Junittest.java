package tn11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.Assert;

public class Junittest {
    
	
	WebDriver driver;
	@Before
	public void testSetup() {
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
		
		
	}
	
	@After
	public void testShutDown() {
		
		driver.quit();

	}
	
	@Test
	public void Testing1() throws InterruptedException {
		
        
		N11LoginScreenObjects page = new N11LoginScreenObjects(driver);
		
		
		page.ClickGýrýsYap();
		
		
		
		page.Login();
		Assert.assertTrue(
				
				driver.findElement(By.className("username")).getText().equals("Ahmet Yörük")
				
				);
		
		
	}
	
	
	


}
