package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZB_RuninexistingopenBrowser {

	public static void main(String[] args) {

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setExperimentalOption("debuggerAddress", "localhost:9902");
		
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("https://google.com");
		driver.get("https:facebook.com");
		
//		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		
	}

}
