package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//When Element has id; tag#id  or #id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("1234");
		//or
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("1234");
		
		//When element has class name; tag.classname or .classname
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("4567");
		
		//Using only attribute....
		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("4567");
		
		
		//using class & attribute together...
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("45678910");

		Thread.sleep(3000);
		driver.close();
	}

}
