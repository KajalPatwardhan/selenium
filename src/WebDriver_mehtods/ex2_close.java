package WebDriver_mehtods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex2_close 
{
   public static void main(String[] args) throws InterruptedException 
   { 
	 WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.instagram.com/");
	  Thread.sleep(5000);
	  driver.close();
}
}