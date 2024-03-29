package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) {
	     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand Kumar\\Downloads\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 
		 driver.findElement(By.id("btnLogin")).click();
		 
		 driver.findElement(By.linkText("My Info")).click();
		 
		 driver.findElement(By.linkText("Memberships")).click();
		 
		 driver.findElement(By.id("btnAddMembershipDetail")).click();
		 
		 Select selectMemb=new Select(driver.findElement(By.name("membership[membership]")));
	     selectMemb.selectByIndex(2);
	     
	     Select selectSubsPaid=new Select(driver.findElement(By.name("membership[subscriptionPaidBy]")));
	     selectSubsPaid.selectByIndex(1);
	     
	     driver.findElement(By.name("membership[subscriptionAmount]")).sendKeys("1200");
	     
	     Select selectCurrency=new Select(driver.findElement(By.name("membership[currency]")));
	     selectCurrency.selectByVisibleText("Malaysian Ringgit");
	     
	     driver.findElement(By.id("membership_subscriptionCommenceDate")).clear();
         driver.findElement(By.id("membership_subscriptionCommenceDate")).sendKeys("2022-03-31");
           
         driver.findElement(By.id("membership_subscriptionRenewalDate")).clear();
         driver.findElement(By.id("membership_subscriptionRenewalDate")).sendKeys("2022-04-20");
		 	
		 driver.findElement(By.id("btnSaveMembership")).click();
		 
        
	}

}
