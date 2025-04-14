package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashBoard;
import pageObjects.Landing_Page;
import pageObjects.LoginPage;
import pageObjects.NotesPage;
import pageObjects.SignupPage;
import pageObjects.ToDoPage;
import testBase.BaseClass;

public class UserFlowTest extends BaseClass{
	
	
	
	@Test (priority=1)
	public void clickSignUp() {
		Landing_Page lp= new Landing_Page(driver);
		lp.clickSignup();
		
	}
	
	@Test(priority=2)
	public void fillForm() throws InterruptedException {
		SignupPage sp=new SignupPage(driver);
		sp.setName("Vishnu");
		sp.setEmail(sp.randomString()+"@gmail.com");  // Used random Strings from commons library
		sp.setPassword("Password"); 
		sp.setConfirmPassword("Password");
		sp.clickSignup();
		
		Thread.sleep(5000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://notes-makers.vercel.app/pages/login");  //Assertion 
		
		
	}
	
	
	

	@Test(priority = 3)
	public void signinTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		if(driver.getCurrentUrl().contains("login")) {
		lp.setEmail("zenintoji125@gmail.com");
		lp.setPass("John123");
		lp.clickSignin();
		}
		Thread.sleep(3000);
		
	}
	

	
	@Test(priority=4)
	public void crateNotes() throws InterruptedException {
		DashBoard db=new DashBoard(driver);
		db.clickProfileIcon();
		db.clickNotes();
		
		NotesPage note=new NotesPage(driver);
		note.clickWrite();
		note.setTitle("Test Notes");
		note.setBody("This is a Test");
		note.clickSaveChanges();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 5)
	public void testTodo() throws InterruptedException {
		DashBoard db= new DashBoard(driver);
		db.clickProfileIcon();
		db.clickToDo();
		
		ToDoPage todo =new ToDoPage(driver);
		Thread.sleep(4000);
		todo.setTodo("This is a ToDo Test");
		
		todo.clickPriority();
		todo.selectPriority();
		todo.setDate("14/04/2025");
		todo.clickAdd();
		Thread.sleep(4000);
		
	}
	
	
	@Test(priority=6)
	public void logout() throws InterruptedException {
		DashBoard db= new DashBoard(driver);
		Thread.sleep(4000);
		db.clickProfileIcon();
		db.clicklogout();   
		Thread.sleep(4000);
	}
	
	
	
	
	

}
