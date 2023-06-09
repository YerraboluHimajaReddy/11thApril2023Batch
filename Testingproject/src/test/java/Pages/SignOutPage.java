package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignOutPage {

	WebDriver driver;

	public SignOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath  ="//a[text()='About']")
	private WebElement about_button;
	
	@FindBy(xpath  ="//a[text()='Support']")
	private WebElement support_button;
	
	@FindBy(xpath  ="//a[text()='Change Password']")
	private WebElement changePassword_button;
	
	@FindBy(xpath  ="//a[text()='Logout']")
	private WebElement Logout;

	public void clickLogout() {

		Logout.click();
	}

	public void clickChangePassword() {

		changePassword_button.click();
	}

	public void clickSupport() {

		support_button.click();
	}

	public void clickAb0ut() {

		about_button.click();
	}


}
