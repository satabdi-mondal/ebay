package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Testbase;

public class Homepage extends Testbase{
	
	 WebDriverWait wait;
	
	
		@FindBy(xpath = "//input[@id='gh-ac']")
		@CacheLookup
		 WebElement searchbox;
		
		
		@FindBy(xpath = "//span[text()='Search']")
		@CacheLookup
		 WebElement searchbutton;

		@FindBy(xpath = "(//div[@class='s-item__title'])[3]")
		@CacheLookup
		 WebElement firstbook;

		@FindBy(xpath = "//span[text()='Add to cart']")
		@CacheLookup
		 WebElement addtocartButton;
		
		
		@FindBy(xpath = "//span[text()='1']")
		@CacheLookup
		 WebElement cartButton;

	
	public Homepage() {
	
	PageFactory.initElements(driver, this);
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	

	public void searchbook()  {
		
		searchbox.sendKeys("book");
		searchbutton.click();
	    
		    	
		    }
	
	public void Firstbook() {
		
		firstbook.click();
	}
	public void addtocart() {
		 Actions action = new Actions(driver);
		 wait.until(ExpectedConditions.elementToBeClickable(addtocartButton));	
		 action.moveToElement(addtocartButton).perform();
		 addtocartButton.click();
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		
	//executor.executeScript("window.scrollBy(0,350)", "");
	
		//executor.executeScript("arguments[0].click();", addtocartButton);
		//addtocartButton.click();
	}
		public void verifycart() {
		String itemcount =	cartButton.getText();
		String itemexpectedcount = "1";
		
		Assert.assertEquals(itemcount, itemexpectedcount);
	}
		
		
		
	}
		
	
	
	
	
	


