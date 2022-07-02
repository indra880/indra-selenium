package utilityClasses;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UtilityUsingproperty 
{
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myprop=new FileInputStream ("C:\\Users\\Admin\\eclipse-workspace\\MarchBTesting\\myproperty.properties");
		prop.load(myprop);
		String value = prop.getProperty(key);
		return value;	
	}
	public static void wait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	public static void scrolling(WebDriver driver,WebElement Element)
	{
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("arguments[0].scrollIntoView(true);", Element);
	}
	
	

}
