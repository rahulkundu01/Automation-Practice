package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
	public static WebDriver driver;
	public static String baseUrl= "https://demo.guru99.com/test/upload/";
	public static String file = "C:\\selenium_java\\screenshot\\ss.png";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.id("uploadfile_0")).sendKeys(file);
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/div[2]/h3/center")).getText());
		
		

	}

}
