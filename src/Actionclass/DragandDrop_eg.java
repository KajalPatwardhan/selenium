package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_eg {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement srcele = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement desele = driver.findElement(By.xpath("((//div[@class='ui-widget-content'])[3]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(srcele, desele).perform();
	//act.moveToElement(srcele).clickAndHold().moveToElement(desele).release().perform();
}
}
