package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.yahoofinance.Yahoofinance.Baseclass;
import org.openqa.selenium.support.CacheLookup;

public class Createaccount extends Baseclass {

		
	@FindBy(xpath = "//input[@id='usernamereg-firstName']")
	@CacheLookup
	WebElement fullname;
	
	@FindBy(xpath = "//input[@id='usernamereg-userId']")
	WebElement userid;
	
	@FindBy(xpath = "//fieldset[@id='password-container']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='usernamereg-day']")
	WebElement day;
	
	@FindBy(xpath = "//input[@id='usernamereg-year']")
	WebElement year;
	
	@FindBy(xpath = "//button[@name='signup']")
	WebElement continuebtn;
	
	
	// Initializing the Page Objects:
		public Createaccount() {
			PageFactory.initElements(driver, this);
		}
		
		public boolean verifycreateaccountspage(){
			return fullname.isDisplayed();
		}

		public void enterdata(String fname,String usrid,String pasword,String month,String dy,String yer)
		{
			fullname.sendKeys(fname);
			userid.sendKeys(usrid);
			password.sendKeys(pasword);
			Select s= new Select(driver.findElement(By.xpath(month)));
			s.selectByVisibleText("month");
			day.sendKeys(String.valueOf(dy));
			year.sendKeys(String.valueOf(yer));
			continuebtn.click();
			
		}
			
			
			
			
}
