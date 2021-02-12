package org.day4;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class One {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
 WebElement t = driver.findElement(By.xpath("//a[text()='Create a Page']"));
 System.out.println(t.getText());
 
	}

}
