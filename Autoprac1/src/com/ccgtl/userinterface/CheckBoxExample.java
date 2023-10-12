package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
	public static WebDriver driver;
	public static String baseUrl= "https://demo.guru99.com/test/radio.html";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		driver.findElement(By.id("vfb-6-0")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		driver.findElement(By.id("vfb-6-1")).click();
		
		driver.findElement(By.id("vfb-6-0")).click();

	}

}
