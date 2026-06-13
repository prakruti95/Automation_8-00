package com.a136;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyConnection 
{
	public static WebDriver  connect(String url)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","G:\\Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
	}
}
