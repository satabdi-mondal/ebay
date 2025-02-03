package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.BrowserLoginpage;
import Pages.Homepage;
import base.Testbase;
import io.cucumber.java.en.*;


public class AddToCartStep extends Testbase{
	
	
	 WebDriver driver;
	 WebDriverWait wait;
	 BrowserLoginpage loginPage;
     Homepage homePage;
    
	public AddToCartStep() throws Exception {
		initialization();
	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));	
		loginPage = new BrowserLoginpage();
	homePage = new Homepage();
	}
	
	
	
	
	@Given("User open the browser")
	public void user_open_the_browser() {
		
		loginPage.openBrowser();	
		
	}

	@Given("User enter the ebay website")
	public void user_enter_the_ebay_website() {
		
		loginPage.verifytitle();
	    
	}

	@When("User search for book")
	public void user_search_for_book() {
		
		homePage.searchbook();
	}

	@When("Click on the first book in the list")
	public void click_on_the_first_book_in_the_list() {
		
		homePage.Firstbook();
	}

	@When("click on Add to cart")
	public void click_on_add_to_cart() {
		homePage.addtocart();
		
	   
	}

	@Then("Verify Item has been added to cart")
	public void verify_item_has_been_added_to_cart() {
		homePage.verifycart();
	   
	}



}
