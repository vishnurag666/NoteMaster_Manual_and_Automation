package pageObjects;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage{

	public SignupPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath=("//input[@id='name']"))
	WebElement txtName;
	
	@FindBy(xpath=("//input[@id='email']"))
	WebElement txtEmail;
	
	@FindBy(xpath=("//input[@id='password']"))
	WebElement txtPassword;
	
	@FindBy(xpath=("//input[@id='confirmPassword']"))
	WebElement txtConfirmPassword;
	
	@FindBy(xpath=("//body//div//div//main//div//div//div//div//div//button//strong[contains(text(),'Sign Up')]"))
	WebElement btnSignup;
	
	public void setName(String name) {
		txtName.sendKeys(name);
	}
	
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
		
	}
	
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	public void setConfirmPassword(String confirm) {
		txtConfirmPassword.sendKeys(confirm);
	}
	
	public void clickSignup() {
		btnSignup.click();
	}
	
	@FindBy(xpath=("//a[normalize-space()='Login']"))
	WebElement lnkSignin;
	
	public void clickSigninlnk() {
		lnkSignin.click();
	}
	
	
	 
	
	
 
}
