package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	static
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
	}

	WebDriver driver;

@Given("browser is open")
public void browser_is_open() {
    // Write code here that turns the phrase above into concrete actions
	driver=new ChromeDriver();
   
}

@And("application is displayed")
public void application_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	driver.get("https://demowebshop.tricentis.com/");
    
}

@When("user click on login link")
public void user_click_on_login_link() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.partialLinkText("Log")).click();
    
}

@And("user enters valid credential")
public void user_enters_valid_credential() {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.id("Email")).sendKeys("shriarun12@gmail.com");
   driver.findElement(By.id("Password")).sendKeys("87456321");
}

@And("user click on login button")
public void user_click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
}

@Then("user must be sucessfully logged in")
public void user_must_be_sucessfully_logged_in() {
    // Write code here that turns the phrase above into concrete actions

    if(driver.findElement(By.xpath("//a[contains(text(),'shri')]")).getText().contains("shriarun12@gmail.com"))
    {
    	System.out.println("pass test case");
	}
}

@And("browser closes")
public void browser_closes() {
    // Write code here that turns the phrase above into concrete actions
    driver.quit();
    System.out.println("done succsfully");
    
}




}
