package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Canarabank {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(a.getText());
		a.accept();
		
	}
	

}
