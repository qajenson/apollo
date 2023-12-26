package locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Logout {
	WebDriver driver;

	// Constructor
	public Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Home Page - Click User Profile Name
	@FindBy(xpath = "//span[@id='last-span-hover']")
	WebElement hPage_user_dd_profileName;

	// Home Page - Click User Profile - Logout.
	@FindBy(xpath = "//span[@id='menu-span-last-link-span-1']")
	WebElement hPage_user_dd_logout;

	public void userLogout() throws InterruptedException {
		hPage_user_dd_profileName.click();
		Thread.sleep(5000);
		String ActOption = hPage_user_dd_logout.getText();
		String ExpOption = "Logout";
		Assert.assertEquals(ExpOption, ActOption);
		hPage_user_dd_logout.click();
	}
}
