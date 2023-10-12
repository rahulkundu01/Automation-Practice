package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Rahul");
		//String s = element.get
		System.out.println(element.getAttribute("value"));
		//System.out.println(s);
		

	}

}
