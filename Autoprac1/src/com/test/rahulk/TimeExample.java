package com.test.rahulk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeExample {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		
		long stime,etime,total;
		
		stime = System.currentTimeMillis();
		System.out.println(stime);
		driver.get("https://www.bing.com");
		etime = System.currentTimeMillis();
		System.out.println(etime);
		total = etime - stime;
		System.out.println(total);


	}

}
