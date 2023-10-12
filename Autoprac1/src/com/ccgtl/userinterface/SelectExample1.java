package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample1 implements Utility {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.xpath(link1)).click();
		driver.navigate().back();
		Thread.sleep(2000);
		Select s1 = new Select(driver.findElement(By.id(dropDown1)));
		s1.selectByIndex(1);
		Thread.sleep(2000);
		Select s2 = new Select(driver.findElement(By.id(dropDown2)));
		s2.selectByVisibleText("Mango");
		Thread.sleep(2000);
		Select s3 = new Select(driver.findElement(By.id(dropDown3)));
		s3.selectByValue("mousevalue");
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
