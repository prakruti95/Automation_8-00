package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class s6_Practice_Form_Ex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = MyConnection.connect("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js  =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.id("firstName")).sendKeys("krunal");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("bambhaniya");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("krunal@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"gender-radio-1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userNumber")).sendKeys("9988778899");
		
		String day = "27";
		String month = "March";
		String year = "2000";
		
		Thread.sleep(1000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement mymonth = driver.findElement(By.className("react-datepicker__month-select"));
		Select m = new Select(mymonth);
		m.selectByVisibleText(month);
		
		Thread.sleep(1000);
		
		WebElement myyear = driver.findElement(By.className("react-datepicker__year-select"));
		Select y = new Select(myyear);
		y.selectByVisibleText(year);
		
		Thread.sleep(1000);
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		
		for(WebElement d : days)
		{
			if(d.getText().equals(day))
			{
				if(d.getAttribute("aria-label").contains(month))
				{
					d.click();
					break;
				}
				
			}
		}
		
		Thread.sleep(1000);
		
//		WebElement subject =  driver.findElement(By.id("subjectsInput"));
//		Actions builder = new Actions(driver);
//		builder.click(subject).sendKeys("Maths").sendKeys(Keys.ENTER).build().perform();
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("hobbies-checkbox-1")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("currentAddress")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		ScreenshotEx.getScreenShot(driver, "topstech");
		
	}
}
