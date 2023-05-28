package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_ExpathbyAttribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//un
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		
		//pwd
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		//click on login
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	
		
		
	}

}
