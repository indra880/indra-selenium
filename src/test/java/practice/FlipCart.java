package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FlipCart {
  @Test
  public void buymobile()
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\velocity\\chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("disable-notifications");
	  WebDriver driver = new ChromeDriver(opt);
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  driver.findElement(By.name("q")).sendKeys("iphone");
	  
	  driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro Max (Silver, 128 GB)']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  List<WebElement> ratings = driver.findElements(By.xpath("((//div[@class='_1AtVbE col-12-12'])[6]//span)[5]"));
	  for(WebElement a:ratings)
	  {
		  System.out.println(a.getText());
	  }
	  
	  
  }
}
