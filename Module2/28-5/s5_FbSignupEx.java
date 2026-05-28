package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class s5_FbSignupEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = MyConnection.connect("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[5]/div/a/div/div[1]/div/span/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_")).sendKeys("Krunal");
		Thread.sleep(1000);
		driver.findElement(By.id("_R_1kl2p4jikacppb6amH1_")).sendKeys("Bambhaniya");
		Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".x6j2aps")).click();
		 driver.findElement(By.cssSelector("#\\_r_1___6 .x1lliihq")).click();
		
	}
}
