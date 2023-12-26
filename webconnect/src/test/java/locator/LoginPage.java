package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Username text box
	@FindBy(xpath = "//input[@id='Username']")
	WebElement login_username;

	// Password text box
	@FindBy(xpath = "//input[@id='Password']")
	WebElement login_password;

	// Login button
	@FindBy(id = "login")
	WebElement login_btn;

	// Forgot Password
	@FindBy(xpath = "//input[@id='ForgotPassword']")
	WebElement login_forgotLink;

	// Invalid userlogin - Error Message

	@FindBy(css = "div.validation-summary-errors")
	WebElement login_invalidUser;

	// Forgot Password - Enter username

	@FindBy(xpath = "//input[@id='UserName']")
	WebElement forgot_UserName;

	// Forgot Password - click send button

	@FindBy(xpath = "//input[@value='Send']")
	WebElement forgot_send_btn;

	// Invalid User credentials - Not working

	@FindBy(xpath = "//li[@xpath='1']")
	WebElement invalid_credentials;

	// Action methods

	public void loginValidUser() throws InterruptedException {
		login_username.click();
		login_username.sendKeys("NKorea.681");
		Thread.sleep(2000);
		login_password.click();
		login_password.sendKeys("#qwerty123");
		Thread.sleep(2000);
		login_btn.click();

		String currentURL = driver.getTitle();
		String expectURL = "BSI Connect";
		Assert.assertEquals(currentURL, expectURL);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='topMenu4']")));
		System.out.println("Home page displayed successfully");
		Thread.sleep(5000);
	}

	public void loginInvalidUser(String Username, String Password) throws InterruptedException {
		login_username.click();
		login_username.sendKeys(Username);

		login_password.click();
		login_password.sendKeys(Password);

		login_btn.click();
		Thread.sleep(5000);

		WebElement currentErr = driver.findElement(By.xpath("//li[@xpath='1']"));
		String expectErr = "The Username or Password entered is not valid.";
		Assert.assertEquals(currentErr, expectErr);

	}

	/*
	 * public void username() { login_username.click();
	 * login_username.sendKeys("NKorea.681"); }
	 * 
	 * public void password() { login_password.click();
	 * login_password.sendKeys("#qwerty123");
	 * 
	 * String currentURL = driver.getTitle(); String expectURL = "BSI Connect";
	 * 
	 * Assert.assertEquals(currentURL, expectURL);
	 * 
	 * }
	 * 
	 * public void loginButton() { login_btn.click(); }
	 */

	public void loginForgotLink() {
		login_forgotLink.click();
	}

	public void forgotUsername() {
		forgot_UserName.click();
		forgot_UserName.sendKeys("abc");
	}

	public void forgotSendBtn() {
		forgot_send_btn.click();
	}
}
