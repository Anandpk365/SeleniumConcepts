package com.harman.multipletabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.medibuddy.in/");
		
		 driver.findElement(By.id("wzrk-cancel")).click();
		
		 driver.findElement(By.linkText("For Employer")).click();
		 
		 driver.findElement(By.name("getInTouchName")).sendKeys("Anand");
		 
		 driver.findElement(By.id("getInTouchEmail")).sendKeys("anandpk@gmail.com");
		 
		 driver.findElement(By.id("getInTouchMobile")).sendKeys("123452334");
		 
		 driver.findElement(By.id("getInTouchDesignation")).sendKeys("IT");
		 
		 driver.findElement(By.id("getInTouchEmpCount")).sendKeys("12");
		 
		 driver.findElement(By.xpath("//button[text()='Get in Touch']")).click();

	}

}
