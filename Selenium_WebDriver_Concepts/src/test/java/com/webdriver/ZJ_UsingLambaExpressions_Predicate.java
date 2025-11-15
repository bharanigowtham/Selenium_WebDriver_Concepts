package com.webdriver;

import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZJ_UsingLambaExpressions_Predicate {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		Predicate<WebElement> elementCheck = ele -> ele.isDisplayed() && ele.isEnabled();
		
		if(elementCheck.test(email) && elementCheck.test(password))
		{
			System.out.println("Both the elements are enabled...");
			email.sendKeys("abc@gmail.com");
			password.sendKeys("abc12345!");
		}
		
		Thread.sleep(1500);
		driver.quit();
		
		
		
	}

}
