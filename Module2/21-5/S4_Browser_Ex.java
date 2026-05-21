package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class S4_Browser_Ex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","G:\\Software\\edgedriver_win64\\msedgedriver.exe");
		 
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("q")).sendKeys("tops technologies");
		 Thread.sleep(4000);
		 driver.close();
	}
}
