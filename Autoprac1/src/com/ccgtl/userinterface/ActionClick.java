package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClick {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		/*driver.get("https://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		WebElement ele = driver.findElement(By.xpath("//input[@type='submit']"));
		Actions action = new Actions(driver);
		action.click(ele).build().perform();*/
		
		driver.get("https://demoqa.com/buttons");
		WebElement ele2 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions action2 = new Actions(driver);
		action2.doubleClick(ele2).build().perform();
		
		
		//find the element - ele3 (https://demoqa.com/buttons) for right click button
		//Create new action class object.
		//perform the action.
		action2.contextClick(ele2).build().perform();
		
		

	}

}
