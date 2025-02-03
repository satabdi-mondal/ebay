package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Testbase;
import io.cucumber.java.Before;
import org.junit.*;



public class BrowserLoginpage extends Testbase  {
	


	
	public BrowserLoginpage() {
	
	PageFactory.initElements(driver, this);
	
	}
	public void openBrowser() {
	
	  driver.navigate().to("https://www.ebay.com/");

	}
	
	public void verifytitle() {
		String title = driver.getTitle();
		String actualtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		Assert.assertEquals(title, actualtitle);
	}
	

}
