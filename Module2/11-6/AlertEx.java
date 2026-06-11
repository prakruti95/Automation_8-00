package com.a116;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertEx 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = MyConnection.connect("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver,30);
		
//		driver.findElement(By.id("alertButton")).click();
//		Alert alert =   driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(5000);
//		alert.accept();
		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("timerAlertButton")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert =   driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
//		driver.findElement(By.id("confirmButton")).click();
//		driver.switchTo().alert().dismiss();
		
//		/promtButton
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Typing..");
		alert.accept();
	}
}
