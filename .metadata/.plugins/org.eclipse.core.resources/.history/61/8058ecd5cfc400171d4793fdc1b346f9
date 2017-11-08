package tn11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class testtn11 {

	public static void main(String[] args) throws InterruptedException {

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		WebDriver driver = new FirefoxDriver();
		
		N11LoginScreenObjects page = new N11LoginScreenObjects(driver);
		
		page.ClickGýrýsYap();
		
		page.Login();
		
		N11UserScreenObjects page1 = new N11UserScreenObjects(driver);
		page1.Arat("Samsung");
	    
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(1000);

	    page1.SayfaDegistir();
	   
	    JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(".//*[@id='p-130645823']"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
	    Thread.sleep(2000);  
	    
	    page1.FavorilereEkle();
	    	    
	    page1.FavorilereGit();
	    
	    page1.FavorilerdenCikar();

	    driver.quit();

		
	}
	
	

}
