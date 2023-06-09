package TestNG_Examples;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginToOrangeHRM_Screenshots extends BaseCalss{

	@BeforeSuite
	public void launchBrowser() throws IOException {

		browserLaunch("chrome");

		takeScreenshot("browserlaunching.png");
		
		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launcURL() throws IOException {

		urlLaunch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		takeScreenshot("URLlaunching.png");

		System.out.println("i am in @BeforeClass method");
	}

	@BeforeMethod
	public void maximizeBrowser() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

		driver.manage().window().maximize();

		System.out.println("i am in @BeforeMethod method");

	}

	@Test(priority = 1)
	public void enterUsername() throws IOException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		System.out.println("i am in enterUsername method");
		
		takeScreenshot("username.png");

	}

	@Test(priority = 2)
	public void enterPassword() throws IOException {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		System.out.println("i am in enterPassword method");
		
		takeScreenshot("password.png");

	}

	@Test(priority = 3)
	public void clickLogin() throws IOException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("i am in clickLogin method");
		
		takeScreenshot("homepage.png");

	}

	@AfterMethod
	public void maximizeBrowser1() {

		driver.manage().window().maximize();

		System.out.println("i am in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() throws IOException {
		
		takeScreenshot("BeforeClosingTheBroswer.png");

		browserClose();

		System.out.println("i am in @AfterSuite method");

	}
}
