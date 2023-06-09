package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotYourPasswordPage;

public class ForgotYourPasswordMethods2 {

	WebDriver driver;

	public ForgotYourPasswordMethods2(WebDriver driver) {
		this.driver = driver;
	}
	
	ForgotYourPasswordPage fp = new ForgotYourPasswordPage(driver);
	
	public void enterUsername() {

		driver.findElement(fp.username_TextBox).sendKeys("Evening");
	}

	public void clickCancel() {

		driver.findElement(fp.cancel_Button).click();
	}

	public void clickResetPassword() {

		driver.findElement(fp.resetPassword_Button).click();
	}
}
