package com.a136;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class s006_webtable {
	public static void main(String[] args) {
		
		WebDriver driver = MyConnection.connect("https://demoqa.com/webtables");
		String name = "Cierra";
		
		driver.findElement(By.id("addNewRecordButton")).click();
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[1]")).getText().toString());
		//driver.findElement(By.xpath("//*[@id=\"delete-record-1\"]/svg/path")).click();
//		if(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[1]")).getText().toString().equals(name))
//		{
//			
//		}
//		else
//		{
//			System.out.println("Not Found");
//		}
		//System.out.println(a);
//		try 
//		{
//			WebElement text = driver.findElement(By.xpath("//*[text()='"+name+"']"));
//			if(text.isDisplayed())
//			{
//				driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
//			}
//			
//		} catch (Exception e) {
//			System.out.println("Not found");
//	}
//		
		
	}
}
