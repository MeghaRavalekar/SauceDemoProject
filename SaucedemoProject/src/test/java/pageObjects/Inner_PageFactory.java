package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Inner_PageFactory {

	WebDriver driver;

	// constructor
    public Inner_PageFactory(WebDriver wd) {
		driver = wd;
		PageFactory.initElements(driver, this);
	}

	// Repository of Elements
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement Product1;
    
    @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
   	WebElement Product2;

    @FindBy(xpath = "//button[text()='Add to cart']")
	WebElement AddToCartBtn;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement Cart;


    @FindBy(xpath = "//button[text()='Remove']")
	WebElement RemoveBtn;


    @FindBy(xpath = "//button[@id='checkout']")
	WebElement CheckoutBtn;

    @FindBy(xpath = "//button[@id='continue-shopping']")
	WebElement ContinueShoppingBtn;

    @FindBy(xpath = "//input[@id='first-name']")
	WebElement FirstName;

    @FindBy(xpath = "//input[@id='last-name']")
	WebElement LastName;

    @FindBy(xpath = "//input[@id='postal-code']")
	WebElement Zipcode;

    @FindBy(xpath = "//input[@id='continue']")
	WebElement ContinueBtn;

    @FindBy(xpath = "//button[@id='finish']")
	WebElement FinishBtn;

    @FindBy(xpath = "//div[@id='checkout_complete_container']/child::h2")
	WebElement CheckoutHeading;

    @FindBy(xpath = "//div[@class='complete-text']")
	WebElement Checkouttext;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
   	WebElement MenuBtn;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
   	WebElement Logout;

    
    @FindBy(xpath = "//select[@class='product_sort_container']")
   	WebElement DropDown;
    
   
    
 // Create methods for elements

	public void ClickProduct1() {
		Product1.click();
     }
	
	public void ClickProduct2() {
		Product2.click();
     }

	public void ClickAddToCartBtn() {
		AddToCartBtn.click();
     }

	public void ClickCart() {
		Cart.click();
     }

	public void ClickRemoveBtn() {
		RemoveBtn.click();
     }

	public void ClickCheckoutBtn() {
		CheckoutBtn.click();
     }

	public void ClickContinueShoppingBtn() {
		ContinueShoppingBtn.click();
     }

	public void EnterFirstName(String FN) {
		FirstName.sendKeys(FN);
	}

	public void EnterLastName(String LN) {
		LastName.sendKeys(LN);
	}

	public void EnterZipcode(String ZC) {
		Zipcode.sendKeys(ZC);
	}
	public void ClickContinueBtn() {
		ContinueBtn.click();
     }


	public void ClickFinishBtn() {
		FinishBtn.click();
     }

	public void GetTextCheckoutHeading() {
		System.out.println(CheckoutHeading.getText());
     }

	public void GetTextCheckouttext() {
		System.out.println(Checkouttext.getText());
     }


	public void ClickMenuBtn() {
		MenuBtn.click();
     }

	public void ClickLogout() {
		Logout.click();
     }
	
	public void SelectDropDown() {
		Select Drp = new Select(DropDown);
		
		Drp.selectByValue("lohi");
     }
	
	

}
