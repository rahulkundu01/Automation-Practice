package com.test.rahulk;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExample {
	public static WebDriver driver;
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\properties\\application.properties");
		
		obj.load(objfile);
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(obj.getProperty("baseURL"));
		Thread.sleep(2000);
		
		
		driver.findElement(By.name(obj.getProperty("username"))).sendKeys(obj.getProperty("uname"));
		driver.findElement(By.name(obj.getProperty("password"))).sendKeys(obj.getProperty("pwd"));
		driver.findElement(By.xpath(obj.getProperty("btnLogin"))).click();
		
		
		
		

	}

}
