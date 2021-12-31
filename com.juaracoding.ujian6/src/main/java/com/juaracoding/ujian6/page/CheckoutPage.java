package com.juaracoding.ujian6.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian6.driver.DriverSingleton;

public class CheckoutPage {
	
private WebDriver driver;
	
	public CheckoutPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#post-6 > div > div > div.cart-collaterals > div.cart_totals > div > a")
	private WebElement btnCheckout;
	
	@FindBy(id ="billing_first_name")
	private WebElement txtFirstName;

	@FindBy(id ="billing_last_name")
	private WebElement txtLastName;
	
	@FindBy(id ="billing_company")
	private WebElement txtCompany;
	
	@FindBy(css ="#billing_country > option:nth-child(104)")
	private WebElement listCountry;
	
	@FindBy(id ="billing_address_1")
	private WebElement txtAddress1;
	
	@FindBy(id ="billing_address_2")
	private WebElement txtAddress2;
	
	@FindBy(id ="billing_city")
	private WebElement txtCity;
	
	@FindBy(css ="#billing_state > option:nth-child(13)")
	private WebElement listProvince;
	
	@FindBy(id ="billing_postcode")
	private WebElement txtPostCode;
	
	@FindBy(id ="billing_phone")
	private WebElement txtPhone;
	
	@FindBy(id ="terms")
	private WebElement chckboxTerms;
	
	@FindBy(css ="#place_order")
	private WebElement btnOrder;
	
	@FindBy(css ="#post-7 > div > div > div > section.woocommerce-order-details > h2")
	private WebElement txtDisplayName3;
	
	public void gotoInputBilling() {
		btnCheckout.click();
		txtFirstName.sendKeys("Yogs");
		txtLastName.sendKeys("Ars");
		txtCompany.sendKeys("Juara Coding");
		listCountry.click();
		txtAddress1.sendKeys("Taman Cipayung");
		txtAddress2.sendKeys("no 232");
		txtCity.sendKeys("Depok");
		listProvince.click();
		txtPostCode.sendKeys("161616");
		txtPhone.sendKeys("0856565656565");
		chckboxTerms.click();
		btnOrder.click();
	}
	
	public String getDisplayName3() {
		return txtDisplayName3.getText();
	}
	
}
