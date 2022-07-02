package testClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClasses.baseclass;
import kiteAppPomClasses.HomePage;
import kiteAppPomClasses.LogInPage;
import kiteAppPomClasses.PinPage;
import utilityClasses.UtilityUsingproperty;
@Listeners(testNGlisteners.Listeners.class)
public class TestNgTestClass extends baseclass
{
	HomePage home;
	LogInPage login;
	PinPage pin;
	
//	@BeforeClass
//	public void launchbrowser() throws IOException
//	{
//		openbrowser();
//		home=new HomePage(driver);
//		login=new LogInPage(driver);
//		pin=new PinPage(driver);
//		
//	}
	@BeforeClass
	public void kiteLogin() throws IOException
	{
		openbrowser();
		home=new HomePage(driver);
		login=new LogInPage(driver);
		pin=new PinPage(driver);
		
		login.sendusername(UtilityUsingproperty.readDataFromPropertyFile("UN"));
		Reporter.log("Entering username.......",true);
		login.sendpassword(UtilityUsingproperty.readDataFromPropertyFile("PWD"));
		Reporter.log("Entering password......",true);
		login.clicklogin();
		UtilityUsingproperty.wait(driver, 1000);
		pin.sendpin(UtilityUsingproperty.readDataFromPropertyFile("PIN"));
		Reporter.log("Entering pin.........",true);
		pin.clickcontinue();
		UtilityUsingproperty.wait(driver, 500);
	}
  @Test (timeOut = 100)
  public void verifyInvestmentButtonisAvailable() 
  {
	boolean investment = home.validateInvestmentButton();
	Assert.assertTrue(investment);
	Reporter.log("investment button is displayed TC is pass",true);
  }
  @Test
  public void verifyStartedButtonIsAvailable()
  {
	 boolean started = home.validatestatedbutton();
	 Assert.assertTrue(started);
	 Reporter.log("Started button is displayed TC is pass",true);
  }
  @AfterClass
  public void logoutKite() throws InterruptedException
  {
	  home.logoutkite();
	  driver.close();
  }
  
  
  
}
