package com.webdriver;

import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZK_UsingLambdaandStreams {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		String date = "20";
		String month = "April";
		String year = "May";
		
		Predicate<WebElement> pred = ele -> ele.isEnabled();
				
		List<WebElement> dates = driver.findElements(By.xpath("//select[@id='day']//option"));
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
