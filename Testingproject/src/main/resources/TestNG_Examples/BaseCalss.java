package TestNG_Examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.DataProvider;

public class BaseCalss {
	
	public WebDriver driver;
	
	public void browserLaunch(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			
			driver = new SafariDriver();
		}
	}
	
	public void urlLaunch(String url) {
		
		driver.get(url);
	}
	
	public void browserClose() {
		
		driver.quit();
	}
	

	@DataProvider(name = "facebookData")
	public Object[][] getData(){
		
		Object[][] values = new Object[10][20];
		
		values[0][0]= "safdar@gmail.com";
		values[0][1]= "safdar123";
		
		values[1][0]= "goutham@gmail.com";
		values[1][1]= "goutham123";
		
		values[2][0]= "sownjanya@gmail.com";
		values[2][1]= "sownjanya123";
		
		return values;
	}

	public void takeScreenshot(String image) throws IOException {
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("C:\\Users\\himaj\\eclipse-workspace\\11thApril2023\\Testingproject\\src\\test\\java\\ScreenshotImages\\"+image));
	}
}
