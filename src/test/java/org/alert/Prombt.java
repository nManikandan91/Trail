package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prombt {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(2000);
		a.sendKeys("Manikandan");
	Thread.sleep(2000);
	System.out.println(a.getText());
	a.accept();
	String sn = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
	System.out.println(sn);
	}
}
