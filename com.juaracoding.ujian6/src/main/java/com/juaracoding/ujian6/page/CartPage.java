package com.juaracoding.ujian6.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian6.driver.DriverSingleton;

public class CartPage {
	
private WebDriver driver;
	
	public CartPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#nav-menu-item-cart > a > span > i")
	private WebElement btnCart;
	
	@FindBy(css ="#post-6 > div > div > p.return-to-shop > a")
	private WebElement btnShop;
	
	@FindBy(css ="#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1281.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme > div.owl-wrapper-outer.autoHeight > div > div.owl-item.active > a > img")
	private WebElement btnShoes;
	
	@FindBy(css ="#pa_color > option.attached.enabled")
	private WebElement btnColor1;
	
	@FindBy(css ="#pa_size > option:nth-child(2)")
	private WebElement btnSize1;
	
	@FindBy(css ="#product-1281 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnAdd1;
	
	@FindBy(css ="#noo-site > header > div.navbar-wrapper > div > div > div > a")
	private WebElement btnSearch;
	
	@FindBy(css ="#noo-site > header > div.search-header.search-header-eff > div.noo-container > form > input.form-control")
	private WebElement txtSearch;
	
	@FindBy(css ="#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1348.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme > div.owl-wrapper-outer.autoHeight > div > div.owl-item.active > a > img")
	private WebElement btnGlass;
	
	@FindBy(css ="#pa_color > option.attached.enabled")
	private WebElement btnColor2;
	
	@FindBy(css ="#pa_size > option.attached.enabled")
	private WebElement btnSize2;
	
	@FindBy(css ="#product-1348 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnAdd2;
	
	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div.cart_totals > table > tbody > tr.order-total > th")
	private WebElement txtDisplayName2;
	
	public void gotoBuyShoes() {
		btnCart.click();
		btnShop.click();
		btnShoes.click();
		btnColor1.click();
		btnSize1.click();
		btnAdd1.click();
	}
	
	public void gotoBuyGlass(String search) {
		btnSearch.click();
		txtSearch.sendKeys(search);
		txtSearch.sendKeys(Keys.ENTER);
		btnGlass.click();
		btnColor2.click();
		btnSize2.click();
		btnAdd2.click();
		btnCart.click();
	}
	
	public String getDisplayName2() {
		return txtDisplayName2.getText();
	}
	
}
