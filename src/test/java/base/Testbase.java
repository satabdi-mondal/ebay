package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testbase {
	
	public static WebDriver driver;
	
	
	public static void initialization(){
		driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
	// WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(20));
  
	}
}
