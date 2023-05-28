package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_XapthbyIndex {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//FN
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kajal");
		
		//Ln 
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("patwardhan");
		
	}

}
