package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class T_RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		By username = RelativeLocator.with(By.name("username")).above(By.name("password"));
		
		driver.findElement(username).sendKeys("Admin");
		
		By pswd = RelativeLocator.with(By.name("password")).below(By.name("username"));

		driver.findElement(pswd).sendKeys("admin123");
		
		By loginBtn = RelativeLocator.with(By.xpath("//button[@type='submit']")).near(By.name("password"));

		driver.findElement(loginBtn).click();
		
	}


}
