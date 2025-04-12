package testCases;

import org.testng.annotations.Test;

import pageObjects.DashBoard;
import pageObjects.Landing_Page;
import pageObjects.LoginPage;
import pageObjects.NotesPage;
import pageObjects.SignupPage;
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
		sp.setEmail("Vishnu593@gmail.com");
		sp.setPassword("Password");
		sp.setConfirmPassword("Password");
		sp.clickSignup();
		
		Thread.sleep(3000);
		
		
	}
	
	
	@Test(priority = 3)
	public void signinTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("zenintoji125@gmail.com");
		lp.setPass("John123");
		lp.clickSignin();
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
	
	
	@Test(priority=5)
	public void logout() {
		DashBoard db= new DashBoard(driver);
		db.clickProfileIcon();
		db.clicklogout();
		
	}
	
	
	
	
	

}
