package com.ccgtl.userinterface;

import org.openqa.selenium.By;

public class FrameExample implements Utility {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get(url2);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		driver.findElement(By.xpath("//a[@data-date='22']")).click();
		Thread.sleep(2000);
		String ss = driver.findElement(By.id("datepicker")).getAttribute("value");
		System.out.println(ss);
		driver.quit();

	}

}
