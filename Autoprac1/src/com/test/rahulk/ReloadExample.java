package com.test.rahulk;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReloadExample {

	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
		//option1
		driver.navigate().refresh();
		
		//option2
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("location.reload()");
		
		//option3
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		

	}

}
