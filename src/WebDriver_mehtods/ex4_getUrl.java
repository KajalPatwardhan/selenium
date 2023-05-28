package WebDriver_mehtods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getUrl 
{
  public static void main(String[] args) 
  {
	WebDriver driver=new ChromeDriver();
	// driver.get("https://paytm.com/");
	 driver.get("https://www.instagram.com/");
	  String  url  = driver.getCurrentUrl();
	  System.out.println(url);

	}
}
