package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe3 {
  @Test
  public void f()
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\velocity\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  driver.switchTo().frame("iframeResult");//switch to outerframe
	  driver.switchTo().frame(0);//switch to innerframe by index 0(only one frame ahe mhnun 0 ghetly)
	  
	  String a = driver.findElement(By.xpath("//body[@style='background-color:powderblue']")).getText();
	  System.out.println(a);
	  driver.switchTo().parentFrame();
	 String b = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width')]")).getText();
        System.out.println(b);
  }
}
