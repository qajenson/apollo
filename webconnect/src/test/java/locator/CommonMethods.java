package locator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class CommonMethods {
	// ----- Common code below -----

		WebDriver driver;

		// Constructor
		public CommonMethods(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		// ----- Common Code above -----

		// Action methods

		public void i_clicked_browser_back_Btn() throws InterruptedException {
			driver.navigate().back();
			Alert alert = driver.switchTo().alert();
			Thread.sleep(5000);
			String alerttext = alert.getText();
			System.out.println("Unsaved Alert Message is: " + alerttext);

//			alert.dismiss();
//			Thread.sleep(5000);
//			driver.navigate().refresh();
		}
}
