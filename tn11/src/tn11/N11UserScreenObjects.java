package tn11;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11UserScreenObjects {

	
	public N11UserScreenObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = ".//*[@id='searchData']")
	public WebElement Search;
	
	@FindBy(xpath = ".//*[@id='header']/div/div/div[2]/div[1]/a")
	public WebElement SearchBtn;
	
	@FindBy(xpath = ".//*[@id='contentListing']/div/div/div[2]/div[3]/a[2]")
	public WebElement sayfa2;
	
	@FindBy(xpath = ".//*[@id='p-130645823']/div[2]/span[2]")
	public WebElement favori;
	
	@FindBy(xpath = ".//*[@id='btnScrollTop']")
	public WebElement btnust;
	
	@FindBy(xpath = ".//*[@id='header']/div/div/div[2]/div[2]/div[3]/a/i")
	public WebElement sepet;
	
	@FindBy(xpath = ".//*[@id='wrapper']/div/div/div/div[2]/h2/a")
	public WebElement favoriler;
	
	@FindBy(xpath = ".//*[@id='p-130645823']/div[1]/div/span")
	public WebElement sil;
	
	@FindBy(xpath = "./html/body/div[5]/div/div/span")
	public WebElement tamam;
	
	public void Arat(String searchText) throws InterruptedException {
		
		Search.sendKeys(searchText);
		SearchBtn.click();
		Thread.sleep(1000);	
	}
	
	public void SayfaDegistir() throws InterruptedException {
		
		sayfa2.click();
		Thread.sleep(1000);	
	}
	

	public void FavorilereEkle() {
		
		favori.click();
	}
	

	public void SayfaUste() {
		
		btnust.click();
	}
    

	public void FavorilereGit() throws InterruptedException {
		
		SayfaUste();
		sepet.click();
		Thread.sleep(1000);
		favoriler.click();
		Thread.sleep(1000);
	}

	public void FavorilerdenCikar() throws InterruptedException {
		
		sil.click();
		Thread.sleep(1000);
		tamam.click();
		Thread.sleep(1000);
	}
	
}
