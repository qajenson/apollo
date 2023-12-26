package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// ----- Common code below -----

		WebDriver driver;

		// Constructor
		public HomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		// ----- Common Code above -----

		// T_Menu - Connect features
		@FindBy(xpath = "//button[@id='appcues-widget-icon']")
		WebElement hTmenu_cf_icon;

		// T_Menu - Reporting
		@FindBy(xpath = "//button[@aria-label='Reporting']")
		WebElement hTmenu_report_icon;

		// T_Menu - Administration
		@FindBy(xpath = "//button[@aria-label='Administration']")
		WebElement hTmenu_gear_icon;

		// T_Menu - Help
		@FindBy(xpath = "//button[@aria-label='Help']")
		WebElement hTmenu_help_icon;

		// T_Menu - User Profile
		@FindBy(xpath = "//span[@id='last-span-hover']")
		WebElement hTmenu_uProfile_icon;

		// S_Menu - Home
		@FindBy(xpath = "//button[@id='home']")
		WebElement hSmenu_Home_icon;

		// S_Menu - Auditing
		@FindBy(xpath = "//button[@aria-label='Auditing']")
		WebElement hSmenu_Audit_icon;

		// S_Menu - Findings
		@FindBy(xpath = "//button[@aria-label='Findings']")
		WebElement hSmenu_Fin_icon;

		// S_Menu - Actions
//		@FindBy(xpath = "//button[@aria-label='Actions']")
//		WebElement hSmenu_Act_icon;

		// S_Menu - BSI Certificates & Reports
		@FindBy(xpath = "//button[@aria-label='BSI Certificates & Reports']")
		WebElement hSmenu_BSI_CR_icon;

		// SSub_menu - Actions -> View Actions

//		@FindBy(xpath = "//button[@id='>View Actions']")
//		WebElement hSmenu_viewActions;

		// SSub_menu - Actions -> Create Action

//		@FindBy(xpath = "//button[@id='>Create Action']")
//		WebElement hSmenu_createAction;

		// Home Page = My To Do's - Click Findings
		@FindBy(xpath = "(//span[@id='my-todo-name'])[2]")
		WebElement hPage_mtds_Findings;

		// -----Action methods below-----
		public void tMenu_Connectfeature_click() {
			hTmenu_cf_icon.clear();
		}

		public void tMenu_Reporting_click() {
			hTmenu_report_icon.click();
		}

		public void tMenu_Administration_click() {
			hTmenu_gear_icon.click();
		}

		public void tMenu_Help_click() {
			hTmenu_help_icon.click();
		}

		public void tMenu_UProfile_click() {
			hTmenu_help_icon.click();
		}

		public void sMenu_Home_click() {
			hSmenu_Home_icon.click();
		}

		public void sMenu_Auiditing_click() {
			hSmenu_Audit_icon.click();
		}

		public void sMenu_Findings_click() {
			hSmenu_Fin_icon.click();
		}

//		public void sMenu_Actions_click() throws InterruptedException {
//			hSmenu_Act_icon.click();
//			// hSmenu_viewActions.click();
//			Thread.sleep(4000);
//			hSmenu_createAction.click();
	//
//		}

		public void sMenu_bsiCR_click() {

			hSmenu_BSI_CR_icon.click();
		}

		// public void sMenu_viewActions() {
		// hSmenu_viewActions.click();
		// }

		// public void sMenu_createActions() {
		// hSmenu_createAction.click();
		// }

		public void mYtodos_Findings() throws InterruptedException {
			hPage_mtds_Findings.click();
			System.out.println("User clicked Home Page My To Dos: Findings");
			Thread.sleep(4000);
			sMenu_Home_click();
		}
}
