package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard extends BasePage {

	public DashBoard (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath=("//img[@title='John']"))
	WebElement btnProfile;
	
	@FindBy(xpath=("//li[normalize-space()='Notebooks']"))
    WebElement lnkNoteBook;
	
	public void clickProfileIcon() {
		btnProfile.click();
	}
	
	public void clickNotbook() {
		lnkNoteBook.click();
	}
	
	@FindBy(xpath=("//li[normalize-space()='Notes']"))
	WebElement lnkNotes;
	
	@FindBy(xpath=("//li[normalize-space()='To-Do List']"))
	WebElement lnkToDo;
	
	@FindBy(xpath=("//li[normalize-space()='Profile']"))
	WebElement lnkProfile;
	
	@FindBy(xpath=("//li[normalize-space()='Logout']"))
	WebElement lnkLogout;
	
	
	public void clickNotes() {
		lnkNotes.click();
	}
	
	
	public void clickToDo() {
		lnkToDo.click();
	}
	
	
	public void clickProfile() {
		lnkProfile.click();
	}
	
	public void clicklogout() {
		lnkLogout.click();
	}
}
