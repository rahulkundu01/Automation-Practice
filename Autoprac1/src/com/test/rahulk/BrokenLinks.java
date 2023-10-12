package com.test.rahulk;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static WebDriver driver;
	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		 List <WebElement> links= driver.findElements(By.tagName("a"));
		 System.out.println("No of Links are: "+links.size());
		 
		 for(WebElement e : links) {
			 String URL = e.getAttribute("href");
			 //System.out.println(URL);
			 checkBrokenLink(URL);
		 }
		 System.out.println("Number of Broken Links: "+count);
	 
		 
		 driver.quit();

	}
	private static void checkBrokenLink(String linkURL) {
		
		try {
			URL url = new URL(linkURL);
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(5000);
			connection.connect();
			
			if(connection.getResponseCode() > 400) {
				System.out.println(linkURL +" -----> "+connection.getResponseMessage()+" is Broken");
				count = count + 1;
				
			}
			else {
				System.out.println(linkURL +" -----> "+connection.getResponseMessage());
			}
			
			
		}
		catch(Exception e) {
			
		}
		
		
	}

}
