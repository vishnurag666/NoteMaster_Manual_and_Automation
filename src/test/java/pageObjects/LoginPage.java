package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath=("//input[@id='email']"))
	WebElement txtEmail;
	
	@FindBy(xpath=("//input[@id='password']"))
	WebElement txtPass;
	
	@FindBy(xpath=("//body//div//div//main//div//div//div//div//div//button"))
	WebElement btnSignIn;
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPass(String pass) {
		txtPass.sendKeys(pass);
	}
	
	public void clickSignin() {
		btnSignIn.click();
	}
 
	
}
