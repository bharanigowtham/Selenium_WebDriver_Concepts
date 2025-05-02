package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L_Openlinkinnewtab {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		
		String newtab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		loginlink.sendKeys(newtab);
		
		
		
	}

}
