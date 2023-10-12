package com.ccgtl.userinterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagCountExample {
	public static WebDriver driver;
	public static String baseUrl= "https://www.calculator.net";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		List<WebElement> element = driver.findElements(By.tagName("a"));
		System.out.println("Number of links are: "+element.size());
		
		/*for(int i = 0 ; i < element.size() ; i++) {
			System.out.println("Link Text: "+element.get(i).getAttribute("value"));
		}*/
			
		
		
		
		
		driver.close();
	}

}
