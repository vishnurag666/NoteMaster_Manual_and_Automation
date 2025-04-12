package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NoteBook extends BasePage {
  public NoteBook(WebDriver driver) {
	  super(driver);
  }
  
  @FindBy(xpath=("//strong[contains(@class,'flex items-center justify-center')]"))
  WebElement btnCreateBook;
  
  public void clickCreateBook() {
	  btnCreateBook.click();
  }
  
  @FindBy(xpath=("//input[@id='title']"))
  WebElement txtTitle;
  
  @FindBy(xpath=("//strong[normalize-space()='Submit']"))
  WebElement btnSubmit;
  
  public void setTitle(String title) {
	  txtTitle.sendKeys(title);
  }
  
  public void clickSubmit() {
	  btnSubmit.click();
  }
		
  
}
