package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SBI {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='login_button'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Button2']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
System.out.println(a.getText());
a.accept();
driver.quit();
}
}
