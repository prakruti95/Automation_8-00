package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S3_Input_Ex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//		driver.findElement(By.linkText("Sign up")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("sign-username")).sendKeys("krunal_tops");
//		driver.findElement(By.id("sign-password")).sendKeys("1234");
//		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginusername")).sendKeys("krunal_tops");
		driver.findElement(By.id("loginpassword")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
	}
}
