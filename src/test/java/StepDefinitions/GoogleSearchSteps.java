package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver=null;

	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		System.setProperty("webdriver.chrome.driver", "D:\\Rudrarup\\eclipseautomation\\MavenCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user is on google search page");
		driver.navigate().to("https://www.google.com/");
	}


	@When("user enters a tet is search box")
	public void user_enters_a_tet_is_search_box() {
		System.out.println("user enters a tet is search box");
		driver.findElement(By.name("q")).sendKeys("Testing");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("user is navigated to search results");
		driver.getPageSource().contains("definition of testing?");
		driver.close();
		driver.quit();
	}

}
