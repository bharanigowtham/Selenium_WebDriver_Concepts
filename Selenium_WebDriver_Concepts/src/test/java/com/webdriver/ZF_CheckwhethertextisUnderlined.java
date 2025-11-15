package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZF_CheckwhethertextisUnderlined {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(1000);
		
		WebElement lang = driver.findElement(By.xpath("//a[contains(text(),'Bahasa Melayu')]"));
		String cssvalue = lang.getCssValue("text-decoration");
		System.out.println("Value before hover = " + cssvalue);
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(lang).perform();
		Thread.sleep(1000);
		
		String cssvalue2 = lang.getCssValue("text-decoration");
		System.out.println("Value after hover = " + cssvalue2);
		
		driver.close();
		
	}

}
