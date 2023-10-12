package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover implements Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get(url3);
		
		WebElement linkFlight = driver.findElement(By.linkText("Home"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(linkFlight).perform();

	}

}
