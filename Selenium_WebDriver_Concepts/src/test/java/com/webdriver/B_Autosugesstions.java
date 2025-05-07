package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Autosugesstions {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("Selenium");
		Thread.sleep(2000);
		
		List<WebElement> listbox = driver.findElements(By.xpath("//ul[@role='listbox']//li//div//span"));
		
		for(WebElement ele :listbox)
		{
			String element = ele.getText();
			
			if(element.equalsIgnoreCase("selenium testing"))
			{
				ele.click();
				break;
			}
		}
		
		System.out.println("Test completed...");
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
