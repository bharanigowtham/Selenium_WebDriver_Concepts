package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class U_HandleAlertsWithoutusingSwitchto {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(3000);
		
		//1
//		WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wdWait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();
		
		//2
		JavascriptExecutor jsexe = (JavascriptExecutor)driver;
		try {
		jsexe.executeScript("window.alert=function{};");
		} catch(Exception e) {
			//e.printStackTrace();
		}
		
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
	}

}
