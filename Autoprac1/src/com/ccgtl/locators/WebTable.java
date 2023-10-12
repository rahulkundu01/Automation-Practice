package com.ccgtl.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rahul/OneDrive/documents/website/testrk03.html");
		//WebElement wt = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]"));
		
		String cellData = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]")).getText();
		//System.out.println(wt.getText());
		System.out.println(cellData);
		
		driver.quit();
		
		

	}

}
