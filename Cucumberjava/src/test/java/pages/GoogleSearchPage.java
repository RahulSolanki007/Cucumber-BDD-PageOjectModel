package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	By txt = By.name("q");
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterText(String text) {
		driver.findElement(txt).sendKeys(text);
	}

}
