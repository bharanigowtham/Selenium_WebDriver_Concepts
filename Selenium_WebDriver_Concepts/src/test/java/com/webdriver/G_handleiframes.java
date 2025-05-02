package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_handleiframes {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerframe);
		System.out.println("Switched to outerframe");
		
		WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		System.out.println("Switched to innerframe");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		System.out.println("Text entered");

		driver.switchTo().parentFrame();
		System.out.println("Switched to outerframe");
		
		driver.switchTo().defaultContent();
		System.out.println("Switched to main frame...");
		Thread.sleep(3000);
		driver.close();
	}

}
