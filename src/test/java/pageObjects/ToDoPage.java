package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ToDoPage extends BasePage{
   
	public ToDoPage (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath=("//input[@placeholder=\"Write Todo\"]"))
	WebElement txtWriteTodo;
	
	@FindBy(xpath=("//select[@class=\"p-3 h-[53px] w-full rounded-md text-[16px] border-2  border-primary-950 \"]"))
	WebElement drpPriority;
	
	
	
	@FindBy(xpath=("//input[@type=\"date\"]"))
	WebElement setDate;
	
	@FindBy(xpath=("//strong[text()=\"Add\"]"))
	WebElement btnAdd; 
	
	
	public void setTodo(String todo) {
		txtWriteTodo.sendKeys(todo);
	}
	
	public void clickPriority() {
		drpPriority.click();
	}
	
	public void selectPriority() {
		Select select= new Select(drpPriority);
		select.selectByVisibleText("High");
	}
	
	public void setDate(String date) {
		setDate.sendKeys(date);
	}
	
	public void clickAdd() {
		btnAdd.click();
	}
	
	
	
	
	
	
	
	
	
	
}
