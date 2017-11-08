package tn11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11LoginScreenObjects {

	public N11LoginScreenObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.navigate().to("https://www.n11.com");
	}

	@FindBy(xpath = ".//*[@id='header']/div/div/div[2]/div[2]/div[1]/div/div/a[1]")
	public WebElement Giris;
	
	@FindBy(name = "email")
	public WebElement Emaill;
	
	@FindBy(xpath = ".//*[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath = ".//*[@id='loginButton']")
	public WebElement BtnGiris;
	
	public void ClickGýrýsYap() throws InterruptedException {
		Giris.click();
		Thread.sleep(1000);
		
	}
	
	public void Login() throws InterruptedException {
		
		
		Emaill.sendKeys("ahmetyoruk1991@hotmail.com");
		Password.sendKeys("Aa9134nn");
		BtnGiris.click();
		Thread.sleep(1000);
		
	}

	

}
