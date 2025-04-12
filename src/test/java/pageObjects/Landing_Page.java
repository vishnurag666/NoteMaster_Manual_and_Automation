package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Landing_Page extends BasePage {
  
	
	public Landing_Page(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath=("//strong[normalize-space()='Sign Up']"))
	WebElement btnSignup;
	
	@FindBy(xpath=("//strong[normalize-space()='Login']"))
	WebElement btnLogin;
	
	@FindBy(xpath=("//strong[normalize-space()='Login']"))
	WebElement btnLetsGetStarted;
	
	public void clickSignup() {
		btnSignup.click();
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void click()
	{
		btnLetsGetStarted.click();
	}
	
}
