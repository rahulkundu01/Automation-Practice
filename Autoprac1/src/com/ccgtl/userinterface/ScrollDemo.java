package com.ccgtl.userinterface;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollDemo implements Utility{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get("https://www.testingbuddy.co.in");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,2000)");  //Scroll page down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)"); //Scroll page up
	}

}
