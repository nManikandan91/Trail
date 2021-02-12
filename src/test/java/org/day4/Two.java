package org.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Two {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.get("http://greenstech.in/selenium-course-content.html");
 driver.manage().window().maximize();
 WebElement t = driver.findElement(By.xpath("//span[text()='Adyar']"));
 String a = t.getText();
 System.out.println(a);
	}
}
