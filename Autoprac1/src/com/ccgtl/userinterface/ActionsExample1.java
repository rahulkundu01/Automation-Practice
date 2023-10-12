package com.ccgtl.userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample1 implements Util2 {
	public WebElement element;
	public WebElement btn;
	public Actions action;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionsExample1 obj = new ActionsExample1();
		obj.initiate();
		obj.navigate();
		obj.testElement();
		obj.close();
	}

	@Override
	public void initiate() {
		// TODO Auto-generated method stub
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	public void navigate() {
		driver.get("https://www.google.com");
	}
	public void testElement(){
		element = driver.findElement(By.xpath("//textarea[@title='Search']"));
		element.sendKeys("hello ");
		element.submit();
		
		action = new Actions(driver);
		action.sendKeys(element,"iphone 15").build().perform();
		
		btn = driver.findElement(By.name("btnK"));
		//btn.submit();
		//btn.click();
		action.click(btn).build().perform();
	
		
		
	}
	public void close() {
		//driver.quit();
	}

}
