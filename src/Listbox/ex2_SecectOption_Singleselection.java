package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2_SecectOption_Singleselection {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(3000);
		//step 1:
		
		     WebElement month =  driver.findElement(By.xpath("//select[@id='month']"));
		      
		      Select s=new Select(month);
		   //    s.selectByVisibleText("Oct");
		     //  s.selectByValue("6");
		       s.selectByIndex(10);
		      

		
	}

}
