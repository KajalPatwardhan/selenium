package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Handling_of_DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//cs button
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		//step 1
	       WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	     //step 2
	     Actions act=new Actions(driver);  
	    //step 3
	     act.moveToElement(login).perform();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Wishlist']")).click();
	     
	     
	     }

}
