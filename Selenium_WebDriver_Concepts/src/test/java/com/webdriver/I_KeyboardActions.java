package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class I_KeyboardActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
        
		driver.manage().window().maximize();
		driver.get("http://textcompare.com/");

		WebElement inputbox1 = driver.findElement(By.name("frm_compare_1"));
		WebElement inputbox2 = driver.findElement(By.name("frm_compare_2"));
				
		inputbox1.sendKeys("Testing the Keyboard Actions");
		
		Actions act = new Actions(driver);  
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");   //selecting text
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c"); //copying text
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(3000);

		act.sendKeys(Keys.TAB);
		act.perform(); //shifting to pasting location 
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v"); //pasting text
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(3000);

		if(inputbox1.getAttribute("value").equals(inputbox2.getAttribute("value")))
			System.out.println("Text copied is same");
		else
			System.out.println("Text not copied");
		
		
		
		
		
	}

}
