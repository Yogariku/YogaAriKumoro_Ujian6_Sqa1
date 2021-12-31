package com.juaracoding.ujian6.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian6.driver.DriverSingleton;

public class RegisterPage {
	
private WebDriver driver;
	
	public RegisterPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="body > p > a")
	private WebElement btnDismiss;
	
	@FindBy(css = "#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li:nth-child(2) > a")
	private WebElement btnMyAccount;
	
	@FindBy(id = "reg_username")
	private WebElement txtRegUser;
	
	@FindBy(id = "reg_email")
	private WebElement txtRegEmail;
	
	@FindBy(id = "reg_password")
	private WebElement txtRegPassword;
	
	@FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
	private WebElement btnRegister;
	
	@FindBy(css = "#noo-site > section > div > div > h1")
	private WebElement txtDisplayName;
	
	public void gotoAccount() {
		btnDismiss.click();
		btnMyAccount.click();
	}
	
	public void gotoRegister(String username, String email, String password) {
		txtRegUser.sendKeys(username);
		txtRegEmail.sendKeys(email);
		txtRegPassword.sendKeys(password);
		btnRegister.click();
	}
	
	public String getDisplayName() {
		return txtDisplayName.getText();
	}

}
