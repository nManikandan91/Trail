package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFC {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement frm = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frm);
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.accept();
		driver.quit();
		
}
}