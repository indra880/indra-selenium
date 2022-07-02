package baseClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import utilityClasses.UtilityUsingproperty;

public class baseclass 

{
	protected static WebDriver driver;
	public void openbrowser() throws IOException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "F:\\velocity\\chromedriver.exe");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get(UtilityUsingproperty.readDataFromPropertyFile("URL"));
		UtilityUsingproperty.wait(driver, 1000);
	}
	
	public void takescreenshot(String TCname) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\velocity\\"+TCname+".png");
		FileHandler.copy(src, dest);
	}
	

}
