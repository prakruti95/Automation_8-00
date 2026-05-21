package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S2_Input_Ex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("mobile_number")).sendKeys("7623061979");
		Thread.sleep(1000);
		driver.findElement(By.id("password-input")).sendKeys("7623061979");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
		//driver.close();//close tab
		driver.quit();//close browser
	}
}
