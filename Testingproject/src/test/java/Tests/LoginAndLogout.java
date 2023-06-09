package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import CommonMethods.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOutPage;

public class LoginAndLogout extends BaseClass {

	LoginPage lp;

	HomePage hp;

	SignOutPage sp;

	@BeforeSuite
	public void launchBrowser() {

		browserLaunch("edge");

		// object creation of page object model

		lp = new LoginPage(driver);

		// object creation of page factory

		hp = PageFactory.initElements(driver, HomePage.class);

		sp = PageFactory.initElements(driver, SignOutPage.class);

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

	@Test(priority = 4)
	public void clickTestDemo() {

		hp.clickTestDemo();

		System.out.println("i am in clickTestDemo method");

	}
	
	@Test(priority = 5)
	public void clickLogout() {
		
		sp.clickLogout();
		
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
