package com.ccgtl.userinterface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertExample01 implements Utility {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.xpath(btnAlert)).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();                               //Cancel the alert
		
		driver.findElement(By.xpath(btnAlert)).click();
		Thread.sleep(2000);
		//Alert alert1 = driver.switchTo().alert();
		alert.accept();                                   //Accept the alert
		//////////////////////////////////////////////////////////////////////////////
		
		driver.get("http://output.jsbin.com/usidix/1");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.switchTo().alert().accept();

	}

}
