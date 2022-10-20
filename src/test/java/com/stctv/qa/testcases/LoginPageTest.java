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
	
	//Validate whether we can select country Bahrain
	@Test
	public void validateCountryBahrain() throws InterruptedException {
		String actualcountry =loginpage.SelectBahrain().toLowerCase();
		String expectedcountry = "bahrain";
		Assert.assertEquals(actualcountry, expectedcountry);
		
	}
	
	//Validate whether we can select country ksa
	@Test
	public void validateCountryKSA() throws InterruptedException {
		String actualcountry =loginpage.SelectKSA().toLowerCase();
		String expectedcountry = "ksa";
		Assert.assertEquals(actualcountry, expectedcountry);
		
	}
	
	
	//Validate whether we can select country kuwait
	@Test
	public void validateCountryKuwait() throws InterruptedException {
		String actualcountry =loginpage.SelectKuwait().toLowerCase();
		String expectedcountry = "kuwait";
		Assert.assertEquals(actualcountry, expectedcountry);
		
	}
	

	//Validate whether the SAR Price displayed for lite package is correct
	@Test
	public void validateLitePackagePriceForSAR() throws InterruptedException {
		int price = loginpage.litePackagePriceinSAR();
		Assert.assertEquals(price, 15);
	}
	

	//Validate whether the SAR Price displayed for classic package is correct
	@Test
	public void validateClassicPackagePriceForSAR() throws InterruptedException {
		int price = loginpage.ClassicPackagePriceinSAR();
		Assert.assertEquals(price, 25);
	}

	//Validate whether the SAR Price  displayed for premium package is correct
	@Test
	public void validatepremiumPackagePriceForSAR() throws InterruptedException {
		int price = loginpage.PremiumPackagePriceinSAR();
		Assert.assertEquals(price, 60);
	}


	//Validate whether the KWD Price displayed for lite package is correct
		@Test
		public void validateLitePackagePriceForKWD() throws InterruptedException {
			String price = loginpage.litePackagePriceinKWD();
			String expectedPrice = "1.2";
			Assert.assertEquals(price, expectedPrice);
		}
		

		//Validate whether the KWD Price displayed for classic package is correct
		@Test
		public void validateClassicPackagePriceForKWD() throws InterruptedException {
			String price = loginpage.ClassicPackagePriceinKWD();
			String expectedPrice = "2.5";
			Assert.assertEquals(price, expectedPrice);
		}

		//Validate whether the KWD Price  displayed for premium package is correct
		@Test
		public void validatepremiumPackagePriceForKWD() throws InterruptedException {
			String price = loginpage.PremiumPackagePriceinKWD();
			String expectedPrice = "4.8";
			Assert.assertEquals(price, expectedPrice);
		}

		//Validate whether the BHD Price displayed for lite package is correct
		@Test
		public void validateLitePackagePriceForBHD() throws InterruptedException {
			String price = loginpage.litePackagePriceinBHD();
			String expectedPrice = "2.0";
			Assert.assertEquals(price, expectedPrice);
		}
		

		//Validate whether the BHD Price displayed for classic package is correct
		@Test
		public void validateClassicPackagePriceForBHD() throws InterruptedException {
			String price = loginpage.ClassicPackagePriceinBHD();
			String expectedPrice = "3.0";
			Assert.assertEquals(price, expectedPrice);
		}

		//Validate whether the BHD Price  displayed for premium package is correct
		@Test
		public void validatepremiumPackagePriceForBHD() throws InterruptedException {
			String price = loginpage.PremiumPackagePriceinBHD();
			String expectedPrice = "6.0";
			Assert.assertEquals(price, expectedPrice);
		}
	
	//Validate the subscription type is lite
	@Test
	public void subscriptionTypeLite() {
		String expectedResponse = "lite";
		String actualResponse = loginpage.subscriptionTypeLite().toLowerCase();
		Assert.assertEquals(actualResponse, expectedResponse);
		
	}
	
	//Validate the subscription type is Classic
	@Test
	public void subscriptionTypeClassic() {
		String expectedResponse = "classic";
		String actualResponse = loginpage.subscriptionTypeClassic().toLowerCase();
		Assert.assertEquals(actualResponse, expectedResponse);
		
	}
	
	//Validate the subscription type is Premium
	@Test
	public void subscriptionTypePremium() {
		String expectedResponse = "premium";
		String actualResponse = loginpage.subscriptionTypePremium().toLowerCase();
		Assert.assertEquals(actualResponse, expectedResponse);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
