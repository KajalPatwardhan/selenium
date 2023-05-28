package WebDriver_mehtods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_quite 
{
   public static void main(String[] args) 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.quit();
	  
}
}
