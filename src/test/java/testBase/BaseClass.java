package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	
public WebDriver driver;  
  
   @BeforeClass
	public void setup() {
		 
	   
	   driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://notes-makers.vercel.app/");
		driver.manage().window().maximize();
		
		
	}
   
   @AfterClass
   public void tearDown() {
	   driver.close();
   }
	
	
	
}
