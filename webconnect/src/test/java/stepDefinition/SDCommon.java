package stepDefinition;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.CommonMethods;
import locator.LoginPage;
import locator.Logout;

public class SDCommon extends AbstractPageSD {

	WebDriver driver = getDriver();
	// WebDriver driver1 = getSessionID();

	LoginPage clg = new LoginPage(driver);
	Logout uLogout = new Logout(driver);
	CommonMethods cM = new CommonMethods(driver);
	// MobileCapabilities mc = new MobileCapabilities();

	@Given("Launch Browser App")
	public void CLaunchApp() throws InterruptedException, MalformedURLException {
		driver.manage().window().maximize();
		driver.get("https://qa-customtemplate1.bsi-connect.net/Login/Login");
		Thread.sleep(4000);
		// mc.initializeDriver();
		// lg.loginValidUser();
	}

	@Then("Login to the BSI Application")
	public void Clogin() throws InterruptedException {
		clg.loginValidUser();
		Thread.sleep(3000);

	}

	@When("User logout from the Application")
	public void hPage_User_Logout() throws InterruptedException {
		Thread.sleep(5000);
		uLogout.userLogout();
		Thread.sleep(2000);
	}

	@Then("I clicked Browser back button")
	public void RecordCreate_BrowserBackBtn() throws InterruptedException {
		cM.i_clicked_browser_back_Btn();
		Thread.sleep(2000);
	}

	@And("Close Browser")
	public void CQuitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		System.out.println("User closed browser");
	}

	@Given("Launch browser Application")
	public void webUserLogin() throws InterruptedException, MalformedURLException {
		driver.manage().window().maximize();
		driver.get("https://qa-customtemplate1.bsi-connect.net/Login/Login");
		Thread.sleep(4000);
		// mc.initializeDriver();
		// lg.loginValidUser();
	}
}
