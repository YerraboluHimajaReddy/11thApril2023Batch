package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Safdar {
	
 public WebDriver driver;	

	@BeforeSuite
	public void launchBrowser() {
		
	    this.driver = new EdgeDriver();
		
		System.out.println("I am in @BeforeSuite method");
		
	}
	
	@BeforeClass
	public void launchURL() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("I am in @BeforeClass method");
	}
	
	@BeforeMethod
	public void maximizeBrowser() {
		
		driver.manage().window().maximize();
		
		System.out.println("I am in @BeforeMethod method");
	}
    
	@Test(priority = 1)
	public void enterUsername() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("I am in enterUsername method");
			
	}
	
    @Test(priority = 2)
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println("I am in enterPassword method");
		
	}
	
    @Test(priority =3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
    
    @AfterSuite
    public void closeBrowser() {
    	
    	driver.quit();
    }


}
