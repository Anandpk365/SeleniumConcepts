package com.harman.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand Kumar\\Downloads\\chromedriver.exe");
		 WebDriver dr=new ChromeDriver();
		 dr.get("https://www.facebook.com/");
		 String title=dr.getTitle();
		 System.out.println(title);
		 String url=dr.getCurrentUrl();
		 System.out.println(url);
		 
		
		 String html=dr.getPageSource();
		 System.out.println(html);
		 
		 dr.quit();
		
		 

	}

}
