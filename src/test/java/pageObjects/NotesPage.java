package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage extends BasePage{
 public NotesPage(WebDriver driver) {
	 super(driver);
 }
 
 @FindBy(xpath=("//strong[normalize-space()='Write Notes']"))
 WebElement btnWriteNotes;
 
 @FindBy(xpath=("//strong[normalize-space()='Create NoteBook']"))
		 WebElement btnCreateNotebook;
 
 public void clickWrite() {
	 btnWriteNotes.click();
 }
 
 public void clickCreateNotebook() {
	 btnCreateNotebook.click();
 }
 
 @FindBy(xpath=("//input[contains(@placeholder,'Notes Title')]"))
 WebElement txtTitle;
 
 @FindBy(xpath=("//div[@class='ql-editor ql-blank']"))
 WebElement txtBody;
 
 @FindBy(xpath=("//strong[normalize-space()='Save Changes']"))
 WebElement btnSaveChanges;
 
 @FindBy(xpath=("//strong[normalize-space()='Add Reminder']"))
 WebElement btnAddReminder;
 
 
 public void setTitle(String title) {
	 txtTitle.sendKeys(title);
 }
 
 public void setBody(String body) {
	 txtBody.sendKeys(body);
 }
 
 public void clickSaveChanges() {
	 btnSaveChanges.click();
 }
 
 public void clickAddReminder() {
	 btnAddReminder.click();
 }

}
