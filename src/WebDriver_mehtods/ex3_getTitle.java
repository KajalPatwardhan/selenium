package WebDriver_mehtods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_getTitle 
{
   public static void main(String[] args) 
   {
	WebDriver driver=new ChromeDriver();
	driver.get("https://paytm.com/");
	       String title =driver.getTitle();
	       System.out.println(title);
			
   }
   
}
