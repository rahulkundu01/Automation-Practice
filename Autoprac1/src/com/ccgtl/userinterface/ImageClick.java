package com.ccgtl.userinterface;

import org.openqa.selenium.By;

public class ImageClick implements Utility {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
		driver.findElement(By.cssSelector("img[title='OpenCart - Demo']")).click();
		Thread.sleep(2000);
		//System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.quit();

	}

}
