package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.Inner_PageFactory;
import pageObjects.Login_PageFactory;

public class TC02_ShopProduct extends BaseClass {

	@Test(priority = 1)
	public static void Login() throws IOException {
		Login_PageFactory Lg = new Login_PageFactory(driver);

		Lg.EnterUserName("standard_user");

		Lg.EnterPassword("secret_sauce");

		Lg.ClickLoginBtn();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public static void SortProduct() throws IOException, InterruptedException {
		Inner_PageFactory Ip = new Inner_PageFactory(driver);

		Ip.SelectDropDown(); // Sort Low To High

		Thread.sleep(2000);

		TakeScreenshot("SortLowToHigh");
	}

	@Test(priority = 3)
	public static void ShopProduct() throws IOException {

		Inner_PageFactory Ip1 = new Inner_PageFactory(driver);

		Ip1.ClickProduct1(); // go to product detail page

		Ip1.ClickAddToCartBtn(); // click on add to cart

		Ip1.ClickCart(); // click on cart

		Ip1.ClickCheckoutBtn(); // click on checkout

		Ip1.EnterFirstName("Megha"); // Send Fname

		Ip1.EnterLastName("Test"); // Send Lname

		Ip1.EnterZipcode("411043"); // Send ZipCode

		Ip1.ClickContinueBtn(); // Click on Continue button

		TakeScreenshot("CheckoutPage");

		Ip1.ClickFinishBtn(); // Click on Finish button

		Ip1.GetTextCheckoutHeading(); // Fetch checkout page text

		Ip1.GetTextCheckouttext();
	}

}
