package Listeners_Example;

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

public class LoginToOrangeHRM extends SowjanyaClass  {

	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		driver = new EdgeDriver();

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launcURL() {

		beforeNavigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		afterNavigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver);

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

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		System.out.println("i am in enterUsername method");

	}

	@Test(priority = 2)
	public void enterPassword() {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		System.out.println("i am in enterPassword method");

	}

	@Test(priority = 3)
	public void clickLogin() {

		beforeClickOn(driver.findElement(By.xpath("//button[@type='submit']")) , driver);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("i am in clickLogin method");

	}

	@AfterMethod
	public void maximizeBrowser1() {

		driver.manage().window().maximize();

		System.out.println("i am in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();

		System.out.println("i am in @AfterSuite method");

	}
}
