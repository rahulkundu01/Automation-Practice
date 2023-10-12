package com.ccgtl.userinterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
	public static WebDriver driver;
	public static String baseUrl= "file:///C:/Users/rahul/OneDrive/Documents/website/xyz.html";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		List < WebElement > element = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(element.size());
		/////////////////////
		String sc = driver.findElement(By.xpath("//label[contains(.,'yes')]")).getText();
		System.out.println(sc);
		/////////////////
		for(int i = 0 ; i < element.size() ; i++) {
			System.out.println("Radio Button Text: "+element.get(i).getAttribute("text"));
		}
		
		List < WebElement > element2 = driver.findElements(By.tagName("p"));
		System.out.println(element2.size());

	}

}
