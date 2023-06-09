package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testing_Edge {

	public static void main(String[] args) {

		WebDriver sowjanya = new ChromeDriver();
		
		sowjanya.get("https://www.selenium.dev/downloads/");
	}

}
