package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(id = "email")
	public WebElement trademart_Username;

	@FindBy(id = "password")
	public WebElement trademart_Password;

	@FindBy(id = "password")
	public WebElement trademart_Login;

}
