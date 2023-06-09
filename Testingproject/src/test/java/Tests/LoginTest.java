package Tests;

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

import CommonMethods.BaseClass;
import Pages.LoginPage;

public class LoginTest extends BaseClass {
	
	LoginPage lp;

	@BeforeSuite
	public void launchBrowser() {

		browserLaunch("edge");
		
		lp = new LoginPage(driver);

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launcURL() {

		urlLaunch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("i am in @BeforeClass method");
	}

	@BeforeMethod
	public void maximizeBrowser() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

		driver.manage().window().maximize();

		System.out.println("i am in @BeforeMethod method");

	}

	@Test(priority = 1)
	public void enterUsername() {

		lp.enterUsername();

		System.out.println("i am in enterUsername method");

	}

	@Test(priority = 2)
	public void enterPassword() {

		lp.enterPassword("admin123");

		System.out.println("i am in enterPassword method");

	}

	@Test(priority = 3)
	public void clickLogin() {

		lp.clickLogin();

		System.out.println("i am in clickLogin method");

	}

	@AfterMethod
	public void maximizeBrowser1() {

		driver.manage().window().maximize();

		System.out.println("i am in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() {

		browserClose();

		System.out.println("i am in @AfterSuite method");

	}
}
