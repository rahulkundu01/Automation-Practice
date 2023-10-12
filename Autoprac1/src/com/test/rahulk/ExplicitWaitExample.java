package com.test.rahulk;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
		WebElement element = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("APjFqb")));
		
		 //= driver.findElement(By.id("APjFqb"));
		element.sendKeys("selenuim");
		element.submit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
		WebElement ele2;// = driver.findElement(By.xpath("//button[@class='Tg7LZd']"));
		ele2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='Tg7LZd']")));
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("iPhone 15");
		ele2.click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
