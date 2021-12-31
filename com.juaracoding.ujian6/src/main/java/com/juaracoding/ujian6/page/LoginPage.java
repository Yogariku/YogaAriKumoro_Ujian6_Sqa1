package com.juaracoding.ujian6.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian6.driver.DriverSingleton;

public class LoginPage {
	
private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="username")
	private WebElement txtUserName;
	
	@FindBy(id ="password")
	private WebElement txtPassword;
	
	@FindBy(css ="#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
	private WebElement btnLogin;
	
	@FindBy(css = "#post-8 > div > div > div > p:nth-child(2) > a")
	private WebElement txtDisplayName1;
	
	public void gotoLogin(String username, String password) {
		txtUserName.sendKeys(username);
		txtPassword.sendKeys(password);
	}
	
	public String getDisplayName1() {
		return txtDisplayName1.getText();
	}

}
