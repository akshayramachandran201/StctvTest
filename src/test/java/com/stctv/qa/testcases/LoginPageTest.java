package com.stctv.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stctv.qa.base.TestBase;
import com.stctv.qa.pages.LoginPage;
import com.stctv.qa.pages.SignUpPage;
import com.stctv.qa.util.TestUtil;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	SignUpPage signuppage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();

	}

	// validate the title of the application in login page
	@Test
	public void loginPageTitleTest() {
		String loginPageTitle = loginpage.validateLoginPageTitle();
		Assert.assertEquals(loginPageTitle, TestUtil.LOGINPAGETITLE);
	}
	
	@Test
	public void signinTest() {
		signuppage = loginpage.signin();
	}
	//Validate whether the amount displayed for lite package is correct
	@Test
	public void liteAmount() {
		int price = loginpage.litePackagePriceinSAR();
		Assert.assertEquals(price, 15);
	}
	
	//Validate whether the amount displayed for classic package is correct
	@Test
	public void classicAmount() {
		int price = loginpage.ClassicPackagePriceinSAR();
		Assert.assertEquals(price, 25);
	}

	//Validate whether the amount displayed for premium package is correct
	@Test
	public void premiumAmount() {
		int price = loginpage.PremiumPackagePriceinSAR();
		Assert.assertEquals(price, 60);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
