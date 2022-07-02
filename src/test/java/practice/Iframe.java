package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe {
  @Test
  public void handleiframe()
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\velocity\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("//button[@type='button']")).click();
	  String a = driver.findElement(By.id("demo")).getText();
	  System.out.println(a);
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
  }
}
