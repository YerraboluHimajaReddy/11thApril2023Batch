package TestNgAttributes;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNG_Examples.BaseCalss;

public class DataProviders_Attribute extends BaseCalss{

	@BeforeSuite
	public void launchBrowser() {

		browserLaunch("chrome");

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launcURL() {

		urlLaunch("https://www.facebook.com/");

		System.out.println("i am in @BeforeClass method");
	}

	@BeforeMethod
	public void maximizeBrowser() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

		driver.manage().window().maximize();

		System.out.println("i am in @BeforeMethod method");

	}
	

	@Test(dataProvider = "facebookData")
	public void enterCredentails(String username, String password) {
		
		driver.findElement(By.id("email")).clear();

		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("pass")).clear();
		
		driver.findElement(By.id("pass")).sendKeys(password);				

		System.out.println("i am in enterCredentails method");
		

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
