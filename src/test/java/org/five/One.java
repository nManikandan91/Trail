package org.five;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class One {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.get("http://demo.guru99.com/test/drag_drop.html ");
 driver.manage().window().maximize();
WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement dep = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
Actions a = new Actions(driver);
	a.dragAndDrop(amount, dep).perform();
	
	
	
	
	}
}
