package com.juaracoding.ujian6.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.ujian6.page.RegisterPage;
import com.juaracoding.ujian6.page.CartPage;
import com.juaracoding.ujian6.page.CheckoutPage;
import com.juaracoding.ujian6.page.LoginPage;
import com.juaracoding.ujian6.utils.ConfigurationProperties;
import com.juaracoding.ujian6.utils.Constants;
import com.juaracoding.ujian6.utils.TestCases;
import com.juaracoding.ujian6.utils.Utils;
import com.juaracoding.ujian6.config.AutomationFrameworkConfiguration;
import com.juaracoding.ujian6.driver.DriverSingleton;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
	
	private WebDriver driver;
	private RegisterPage registerPage;
	private LoginPage loginPage;
	private CartPage cartPage;
	private CheckoutPage checkoutPage;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		registerPage = new RegisterPage();
		loginPage = new LoginPage();
		cartPage = new CartPage();
		checkoutPage = new CheckoutPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	//	Scenario Register
	@Given("^User go to the Website")
	public void user_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	@When("^User click My Account button")
	public void user_click_login_page_button() {
		registerPage.gotoAccount();
		extentTest.log(LogStatus.PASS, "User click login page button");
	}
	
	@When("^User create username email password and click Register")
	public void user_create_username_email_password_and_click_Register() {
		registerPage.gotoRegister(configurationProperties.getUserName(),configurationProperties.getEmail() , configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User create username email password and click Register");
	}
	
	@Then("^User has created an account")
	public void user_has_created_an_account() {
		 assertEquals(configurationProperties.getDisplayName(), registerPage.getDisplayName());
		 extentTest.log(LogStatus.PASS, "User has created an account");
	}
	
	// Scenario Login
	
	@When("^User input username password and click Login")
	public void user_input_username_password_and_click_Login() {
		loginPage.gotoLogin(configurationProperties.getUserName(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input username password and click Login");
	}
	
	@Then("^User can login to the Website")
	public void user_can_login_to_the_Website() {
		 assertEquals(configurationProperties.getDisplayName1(), loginPage.getDisplayName1());
		 extentTest.log(LogStatus.PASS, "User can login to the Website");
	}
	
	// Scenario Add to Cart
	
	@When("^User add shoes to cart")
	public void user_add_shoes_to_the_cart() {
		cartPage.gotoBuyShoes();
		extentTest.log(LogStatus.PASS, "User add shoes to cart");
	}
	
	@When("^User add glass to cart")
	public void user_add_glass_to_cart() {
		cartPage.gotoBuyGlass(configurationProperties.getSearch());
		extentTest.log(LogStatus.PASS, "User add glass to cart");
	}
	
	@Then("^User successfully added items")
	public void user_successfully_added_items() {
		assertEquals(configurationProperties.getDisplayName2(), cartPage.getDisplayName2());
		extentTest.log(LogStatus.PASS, "User can login to the Website");
	}
	
	//Scenario Checkout
	
	@When("^User input billing details")
	public void user_input_billing_details() {
		checkoutPage.gotoInputBilling();
		extentTest.log(LogStatus.PASS, "User input billing details");
	}
	
	@Then("^User has successfully place order")
	public void user_has_successfully_place_order() {
		assertEquals(configurationProperties.getDisplayName3(), checkoutPage.getDisplayName3());
		extentTest.log(LogStatus.PASS, "User can login to the Website");
	}
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
}
