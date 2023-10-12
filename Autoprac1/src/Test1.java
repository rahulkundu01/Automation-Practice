
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("https://google.com");
		wd.get("https://amazon.com");
		wd.navigate().back();
		wd.manage().window().maximize();
		wd.navigate().to("https://amazon.com");
		//Thread.sleep(2000);
		//Scanner sc = new Scanner(System.in);
		
		//getmethods
		
		System.out.println(wd.getCurrentUrl());
		System.out.println(wd.getTitle());
		System.out.println(wd.getClass());
		System.out.println(wd.getWindowHandle());
		
		wd.navigate().back();
		System.out.println(wd.getCurrentUrl());
		
		wd.manage().window().minimize();
		
		
		
		wd.close();
		

	}

}
