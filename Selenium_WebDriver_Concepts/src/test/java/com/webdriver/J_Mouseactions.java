package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class J_Mouseactions {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclickbtn = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));		
		Actions actions = new Actions(driver);
		actions.contextClick(rightclickbtn).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("Alert message = " + msg);
		alert.accept();
		
		Thread.sleep(2000);
		
		
		WebElement doubleclickbtn = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		actions.doubleClick(doubleclickbtn).build().perform();
		driver.switchTo().alert();
		String T = alert.getText();
		System.out.println("New Alert = " + T);
		alert.accept();
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
