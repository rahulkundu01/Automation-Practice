package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClick2 {
	public static WebDriver driver;
	public static WebElement element;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		element = driver.findElement(By.id("rightClickBtn"));
		
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
		
		driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]")).click();
		
		
		

	}

}
