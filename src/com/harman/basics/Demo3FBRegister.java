package com.harman.basics;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand Kumar\\Downloads\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.linkText("Create New Account")).click();
	
		 
		 driver.findElement(By.name("firstname")).sendKeys("Anand");
		 driver.findElement(By.name("lastname")).sendKeys("Kumar");
		 
		 driver.findElement(By.name("reg_email__")).sendKeys("anandpk365@gmail.com");
	     driver.findElement(By.name("reg_email_confirmation__")).sendKeys("anandpk365@gmail.com");
	     driver.findElement(By.id("password_step_input")).sendKeys("anandpk1234");
	     
	     Select selectDay=new Select(driver.findElement(By.id("day")));
	     selectDay.selectByVisibleText("29");
		 
	     Select selectMonth=new Select(driver.findElement(By.id("birthday_month")));
	     selectMonth.selectByValue("12");
	     
	     Select selectYear=new Select(driver.findElement(By.id("birthday_year")));
	     selectYear.selectByVisibleText("2000");
	     
	     Select selectwis=new Select(driver.findElement(By.name("preferd_pronoun")));
	     selectwis.selectByIndex(3);
	     
	     
	     
	     driver.findElement(By.xpath("//input[@value='-1']")).click();
	     driver.findElement(By.name("websubmit")).click();

	}

}
