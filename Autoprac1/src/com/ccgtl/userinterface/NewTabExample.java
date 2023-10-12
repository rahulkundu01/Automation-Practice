package com.ccgtl.userinterface;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabExample {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000)); //selenium 4 or after 4
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //before selenium 4
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//Open Facebook.com in next tab.
		
		/*driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());*/
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.quit();
		

	}

}
