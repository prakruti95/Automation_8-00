package com.a116;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class S013_ScrollDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = MyConnection.connect("https://www.demoblaze.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//
		
		js.executeScript("window.scrollBy(0,50)");
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
