package kiteAppPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//span[text()='WF5585']")private WebElement id;
	@FindBy(xpath = "(//button[@type='button'])[1]")private WebElement investment;
	@FindBy(xpath = "(//button[@type='button'])[2]")private WebElement started;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateInvestmentButton()
	{
		return investment.isDisplayed();
	}
	public boolean validatestatedbutton()
	{
		return started.isDisplayed();
	}
	public void logoutkite() throws InterruptedException
	{
		id.click();
		Thread.sleep(200);
		logout.click();
	}
	

}
