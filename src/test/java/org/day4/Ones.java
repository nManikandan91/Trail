package org.day4;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ones {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.get("http://www.greenstechnologys.com/");
 driver.manage().window().maximize();
 WebElement t = driver.findElement(By.xpath("(//span[@class='blue_text'])[1]"));
 System.out.println(t.getText());
 driver.close();
 
	}}