package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_DropdownusingSelectclass {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
		WebElement dateDD = driver.findElement(By.id("day"));
		Select select = new Select(dateDD);
		select.selectByIndex(23);
		
		WebElement monthDD  =driver.findElement(By.id("month"));
		Select sel = new Select(monthDD);
		sel.selectByValue("10");
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select s = new Select(yearDD);
		s.selectByVisibleText("1990");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
