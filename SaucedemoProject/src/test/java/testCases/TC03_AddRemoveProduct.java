package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.Inner_PageFactory;
import pageObjects.Login_PageFactory;

public class TC03_AddRemoveProduct extends BaseClass {

	@Test(priority = 1)
	public static void Login() throws IOException {
		Login_PageFactory Lg = new Login_PageFactory(driver);

		Lg.EnterUserName("standard_user");

		Lg.EnterPassword("secret_sauce");

		Lg.ClickLoginBtn();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public static void AddProduct() throws IOException {

		Inner_PageFactory Ip = new Inner_PageFactory(driver);

		// Add product to Cart

		Ip.ClickProduct1();

		Ip.ClickAddToCartBtn();

		Ip.ClickCart();

		TakeScreenshot("AddtoCart");

		System.out.println("Product added to cart");

	}

	@Test(priority = 3)
	public static void RemoveProduct() throws IOException {

		Inner_PageFactory Ip1 = new Inner_PageFactory(driver);

		// Remove product from cart

		Ip1.ClickRemoveBtn();

		TakeScreenshot("RemoveFromCart");

		System.out.println("Product removed from cart");

	}

}
