package com.webdriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_Handlingwindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Thread.sleep(5000);
		
		
		Set<String> multiwindows = driver.getWindowHandles();
		System.out.println(multiwindows);
		Iterator<String> iterator = multiwindows.iterator();
		
		String parentwindowID = iterator.next();
		System.out.println(parentwindowID);
		
		String childwindowID = iterator.next();
		System.out.println(childwindowID);
		
		driver.switchTo().window(parentwindowID);
		System.out.println("Parent window title = " + driver.getTitle());
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.switchTo().window(childwindowID);
		System.out.println("Child window title = " + driver.getTitle());
		
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindowID);

		driver.close();
		
		
		
		
		
		
	}

}
