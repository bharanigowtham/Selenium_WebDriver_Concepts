package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class V_HandleFrameWithoutusingSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wdwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_1.html']")));
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Automation");
		
		Thread.sleep(2000);
		driver.close();
	}

}
