package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterTest {
	static
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
	}

	WebDriver driver;

@Given("click on Register Link")
public void click_on_register_link() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.partialLinkText("Register")).click();
}

@And("enter valid credentials")
public void enter_valid_credentials() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	    driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Arun");
	    driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("devadiga");
	    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun1222@gmail.com");
	    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("87456321");
	    driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("87456321");
}

@And("user click on register button")
public void user_click_on_register_button() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@id='register-button']")).click();
	    
}

@Then("user must be sucessfully Register in")
public void user_must_be_sucessfully_register_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
