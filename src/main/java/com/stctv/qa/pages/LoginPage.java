package com.stctv.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stctv.qa.base.TestBase;

public class LoginPage extends TestBase {

	// object repository/ page factory for login page

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement signin;

	@FindBy(xpath = "//a[@class = 'header-btns-country hide-mobile']")
	WebElement selectcountry;

	@FindBy(xpath = "//span[ contains(text() ,'Bahrain') and @class = 'countryName']")
	WebElement Bahrain;

	@FindBy(xpath = "//span[ contains(text() ,'KSA') and @class = 'countryName']")
	WebElement KSA;

	@FindBy(xpath = "//span[ contains(text() ,'Kuwait') and @class = 'countryName']")
	WebElement Kuwait;

	@FindBy(xpath = "//parent::div[@class = 'packages packages Light']//button[contains(text(), 'Start your trial') and @class = 'packages-btn']")
	WebElement lite;

	@FindBy(xpath = "//parent::div[@class = 'packages packages Classic']//button[contains(text(), 'Start your trial') and @class = 'packages-btn']")
	WebElement classic;

	@FindBy(xpath = "//parent::div[@class = 'packages packages Premium']//button[contains(text(), 'Start your trial') and @class = 'packages-btn']")
	WebElement premium;

	@FindBy(xpath = "//parent::div[@class = 'packages packages Light']//span[@class = 'amount']")
	WebElement liteamount;

	@FindBy(xpath = "//parent::div[@class = 'packages packages Classic']//span[@class = 'amount']")
	WebElement classicamount;

	@FindBy(xpath = "//parent::div[@class = 'packages packages Premium']//span[@class = 'amount']")
	WebElement premiumamount;

	// Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public int litePackagePriceinSAR() {
		String amount = liteamount.getText();
		int price = Integer.parseInt(amount);
		return price;
	}

	public int ClassicPackagePriceinSAR() {
		String amount = classicamount.getText();
		int price = Integer.parseInt(amount);
		return price;
	}

	public int PremiumPackagePriceinSAR() {
		String amount = premiumamount.getText();
		int price = Integer.parseInt(amount);
		return price;
	}

	public SignUpPage signin() {
		signin.click();
		return new SignUpPage();
	}

}
