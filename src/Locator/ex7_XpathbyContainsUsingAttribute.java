package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_XpathbyContainsUsingAttribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//un
		driver.findElement(By.xpath("//input[contains(@placeholder,' number')]")).sendKeys("chetan");
		//pwd
		driver.findElement(By.xpath("//input[contains(@class,' _9npi')]")).sendKeys("12345");
		
		//login
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _')]")).click();
	}

}
