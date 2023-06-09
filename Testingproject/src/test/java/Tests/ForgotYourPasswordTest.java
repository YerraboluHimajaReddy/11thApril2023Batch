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
import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class ForgotYourPasswordTest extends BaseClass {
	
	LoginPage lp;
	
	ForgotYourPasswordMethods fpm;

	@BeforeSuite
	public void launchBrowser() {

		browserLaunch("edge");
		
		lp = new LoginPage(driver);
		
		fpm = new ForgotYourPasswordMethods(driver);

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
	public void clickForgotYourPasswordLink() {

		lp.clickForgotYourPassword();

		System.out.println("i am in clickForgotYourPasswordLink method");

	}

	@Test(priority = 2)
	public void enterUserNameTextbox() {

		fpm.enterUsername();

		System.out.println("i am in enterUserNameTextbox method");

	}

	@Test(priority = 3)
	public void clickCancelButton() {

		fpm.clickCancel();

		System.out.println("i am in clickCancelButton method");

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
