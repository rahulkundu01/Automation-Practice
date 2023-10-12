package com.ccgtl.userinterface;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	public static void screenshot(WebDriver driver ,String filename) throws IOException {
		
		TakesScreenshot ts = ((TakesScreenshot)driver); //declearing
		File srcFile = ts.getScreenshotAs(OutputType.FILE); //taking screen shot as file
		FileUtils.copyFile(srcFile, new File("C:\\selenium_java\\screenshot\\"+filename+".png"));
		
	}

}
