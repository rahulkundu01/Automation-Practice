package com.ccgtl.userinterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame(0);
		
		WebElement s = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement d = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(s, d).build().perform();
		
		
		driver.get("file:///C:/Users/rahul/OneDrive/documents/website/testrk2.html");
		driver.switchTo().frame("ParentFrame");
		Select s1 = new Select(driver.findElement(By.id("SelectID_One")));
		s1.selectByIndex(2);
		driver.navigate().back();
		driver.quit();
		
		
		

	}

}
