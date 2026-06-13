package com.a136;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class S005_dynamicTable {
	public static void main(String[] args) {
		
		
		WebDriver driver = MyConnection.connect("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
	}
}
