package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageFactory {

	WebDriver driver;

	// constructor

	public Login_PageFactory(WebDriver wd) {
		driver = wd;
		PageFactory.initElements(driver, this);
	}

	// Repository of Elements

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement UsernameField;

	@FindBy(xpath = "//input[@id='password']")
	WebElement PasswordField;


	@FindBy(xpath = "//input[@id='login-button']")
	WebElement LoginButton;

	@FindBy(xpath = "//div[@class='error-message-container error']/child::h3")
	WebElement ErrorMsg;



	// Create methods for elements

	public void EnterUserName(String UN) {
		UsernameField.sendKeys(UN);
	}

	public void EnterPassword(String PW) {
		PasswordField.sendKeys(PW);
	}

	public void ClickLoginBtn() {
		LoginButton.click();
     }

	public void GetTextErrorMsg() {
		String ErrorMsgstr = ErrorMsg.getText();
		System.out.println(ErrorMsgstr);
     }

	public void ClearUserName() {
		//UsernameField.clear();
		
		UsernameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	}

	public void ClearPassword() {
		//PasswordField.clear();
		
		PasswordField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	}

}
