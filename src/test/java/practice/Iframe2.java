package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe2 {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\velocity\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.automationtesting.in/Frames.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	  
	  WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	  driver.switchTo().frame(outerframe);
	 WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	  driver.switchTo().frame(innerframe);
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");

  }
}
