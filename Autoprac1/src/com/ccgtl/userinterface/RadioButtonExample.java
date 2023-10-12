package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
	public static WebDriver driver;
	public static String baseUrl= "https://demo.guru99.com/test/ajax.html";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("buttoncheck")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='radiobutton']")).getText());
		
		String radioYes = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
		if ( radioYes.equals("Radio button is checked and it's value is Yes")) {
			System.out.println("Radio Button Yes is checked.");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		driver.findElement(By.id("no")).click();
		driver.findElement(By.id("buttoncheck")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='radiobutton']")).getText());
		
		String radioNo = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
		if ( radioNo.equals("Radio button is checked and it's value is No")) {
			System.out.println("'Radio Button No is checked.'");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
		
		
		driver.quit();

	}

}
