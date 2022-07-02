package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
  @Test
  public void googleSearch() 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\velocity\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  driver.findElement(By.name("q")).sendKeys("honda");
	 List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
//	 for(WebElement a:searchresults)
//	 {
//		 System.out.println(a.getText());
//	 }
	 
	 String Expected="honda amaze";
	 for(WebElement a:searchresults)
	 {
		 String actul=a.getText();
		 if(Expected.equals(actul))
		 {
			 a.click();
			 break;
		 }
	 }			 
	  
  }
}
