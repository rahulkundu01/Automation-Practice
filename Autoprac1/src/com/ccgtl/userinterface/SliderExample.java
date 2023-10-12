package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderExample {
	public static String slider = "//span[@class='ui-slider-handle ui-corner-all ui-state-default']";
	public static WebDriver driver;
	public static WebElement element;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider");
		driver.switchTo().frame(0);
		
		element = driver.findElement(By.xpath(slider));
		
		Actions move = new Actions(driver);
		move.dragAndDropBy(element, 500, 0).build().perform();
		
		

	}

}
