package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand Kumar\\Downloads\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.id("email")).sendKeys("apk@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("apk@123");
		 
		 driver.findElement(By.name("login")).click();
		 

	}

}
