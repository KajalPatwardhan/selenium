package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_XpathByContainsUsingText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//create new ac
		//driver.findElement(By.xpath("//a[contains(text(),'new')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'pass')]")).click();
	}

}
