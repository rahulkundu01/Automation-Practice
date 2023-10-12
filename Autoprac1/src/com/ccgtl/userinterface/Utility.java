package com.ccgtl.userinterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Utility {

	public static final WebDriver driver = new ChromeDriver();
	public static final String baseUrl = "file:///C:/Users/rahul/OneDrive/documents/website/testrk.html";
	public static final String url2 = "https://jqueryui.com/datepicker/";
	public static final String url3 = "https://demo.guru99.com/test/newtours/index.php";
	public static final String dropDown1 = "SelectID_One";
	public static final String dropDown2 = "SelectID_Two";
	public static final String dropDown3 = "SelectID_Three";
	public static final String link1 = "//a[@href='https://www.google.com/']";
	public static final String btnAlert = "//button[@onclick='myFunction()']";
	
	
}
