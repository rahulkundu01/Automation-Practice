package com.ccgtl.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorExample3 {
	
	
	
	//WebElement
	//tag name
	
	//   tag[attribute='value']  css selector
	//   //tag[@attribute='value'] xpath
	
	WebDriver driver;
	WebElement we;
	public String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
	LocatorExample3(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public void testNav() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		System.out.println("Navigate to Rediffmail");
	}
	public void testElements() {
		we = driver.findElement(By.id("login1"));
		we.clear();
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		we.sendKeys("test");
		System.out.println(we.getTagName());
	}
	public void testLocator() {
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
	}
	/*public void testLink() {
		List <WebElement> lwe = (List<WebElement>) driver.findElement(By.tagName("a");
		System.out.println(lwe);
	}*/
	public void testLocator2() {
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		LocatorExample3 le = new LocatorExample3();
		le.testNav();
		le.testElements(); le.testLocator();le.testLocator2();
	}

}
