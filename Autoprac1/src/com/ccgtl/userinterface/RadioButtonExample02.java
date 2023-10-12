package com.ccgtl.userinterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample02 {
	public static WebDriver driver;
	public static String baseUrl= "https://demo.guru99.com/test/ajax.html";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		List < WebElement > element = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(element.size());
		
		for(int i = 0 ; i < element.size() ; i++) {
			System.out.println("Radio Button Text: "+element.get(i).getAttribute("value"));
		}
		
		List < WebElement > element2 = driver.findElements(By.tagName("p"));
		System.out.println(element2.size());
		

	}

}
