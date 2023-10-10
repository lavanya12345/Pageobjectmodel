package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yahoofinance.Yahoofinance.Baseclass;
import org.openqa.selenium.support.CacheLookup;
public class Homepage extends Baseclass {

	
	
	@FindBy(xpath = "//a[@id='header-signin-link']")
	@CacheLookup
	WebElement signin;
	
	@FindBy(xpath = "//a[@id='createacc']")
	WebElement createaccount;
	
	
	// Initializing the Page Objects:
		public Homepage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}

		public void clickOnSigninLink(){
			signin.click();
		}
			public void clickOncreateaccount(){
				createaccount.click();
		}
			
			
			
}
