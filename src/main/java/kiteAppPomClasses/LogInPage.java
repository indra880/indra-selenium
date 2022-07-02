package kiteAppPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	@FindBy(id = "userid")private WebElement username;
	@FindBy(id = "password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername(String UN)
	{
		username.sendKeys(UN);
	}
	public void sendpassword(String PWD)
	{
		password.sendKeys(PWD);
		
	}
	public void clicklogin()
	{
		loginButton.click();
		
	}

}
