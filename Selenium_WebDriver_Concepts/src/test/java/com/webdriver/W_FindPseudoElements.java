package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_FindPseudoElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> fields = driver.findElements(By.cssSelector("div.inputs"));
		for(WebElement ele:fields)
		{
			if(ele.getText().contains("*"))
			{
				System.out.println(ele.getText() + " is a mandatory field");
			}
			else 
			{
				System.out.println(ele.getText() + " is NOT a mandatory field");
			}
		}
		
		
		
		
	}

}
