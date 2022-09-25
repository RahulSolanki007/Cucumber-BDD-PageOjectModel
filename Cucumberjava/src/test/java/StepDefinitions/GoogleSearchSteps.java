package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pagefactory.GoogleSearchPage_PF;


public class GoogleSearchSteps {
	
	WebDriver driver = null;
	GoogleSearchPage_PF searchPF;

	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside step - browser is open");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Jar's\\browser drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	   
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    System.out.println("Inside step - user is on google search page");
	    driver.navigate().to("https://google.com");
	}

	@When("^user enters a (.*) in search box$")
	public void user_enters_a_text_in_search_box(String text)  {
	   System.out.println("Inside step pagefactory - user enters a text in search box");
	   searchPF = new GoogleSearchPage_PF(driver);
	   searchPF.enterText(text);
	
	}

	@And("hits enters")
	public void hits_enters() throws InterruptedException {
	   System.out.println("Inside step = hits enters");
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	  System.out.println("Inside step - user is navigated to search result");
	  driver.getPageSource().contains("Online Courses");
	  driver.close();
	  driver.quit();
	}

}
