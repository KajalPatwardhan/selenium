package WebDriver_mehtods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_get {public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
//	driver.close();
//	driver.quit();
//	String title = driver.getTitle();
//	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
}


}
