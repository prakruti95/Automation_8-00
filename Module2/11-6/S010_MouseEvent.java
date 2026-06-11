package com.a116;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class S010_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = MyConnection.connect("https://www.tops-int.com/");
		
		WebElement courses = driver.findElement(By.linkText("Courses"));
		WebElement placement = driver.findElement(By.linkText("Placement"));
		WebElement webinar = driver.findElement(By.linkText("Webinars"));
		
		
		
		Actions builder = new Actions(driver);
		
		
		builder.moveToElement(courses).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(placement).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(webinar).build().perform();
		Thread.sleep(2000);
		
		
	}
}
