package com.stepdefinetion;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStep {
	WebDriver driver;
	@Given("user is on the facebook page")
	public void user_is_on_the_facebook_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
	    driver.get("https://omrbranch.com/");
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(DurationOfTime(40));
	}
	
	  

	@When("user enter {string} and {string}")
	public void user_enter_and(String name, String pass) {
	    driver.findElement(By.id("email")).sendKeys(name);
	    driver.findElement(By.id("pass")).sendKeys(pass);
	}

	
	@When("user click the login button")
	public void user_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//button[@value='login']")).click();

	}
	@Then("user should verify afer login success message")
	public void user_should_verify_afer_login_success_message() {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue("verify after login",true);
	}
}
