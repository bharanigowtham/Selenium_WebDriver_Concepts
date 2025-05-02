package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class N_XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//1 - Self 
//		driver.findElement(By.xpath("//input[@name='firstname']/self::input")).sendKeys("Tom");
//		driver.findElement(By.xpath("//input[@name='lastname']/self::input")).sendKeys("Steve");
		
		//2-Child
//		driver.findElement(By.xpath("//div[@id='fullname_field']/child::div//input[@name='firstname']")).sendKeys("Williard");
//		driver.findElement(By.xpath("//div[@id='fullname_field']/child::div//input[@name='lastname']")).sendKeys("Williard");

		//3 -Parent
//		driver.findElement(By.xpath("//input[@name='firstname']//parent::div//input")).sendKeys("ABC");
		
		//4-Ancestor
//		driver.findElement(By.xpath("(//input[@name='firstname']//ancestor::div[@id='reg_form_box']//div[@id='fullname_field']//input)[1]")).sendKeys("D");

		//5-Descendant
//		driver.findElement(By.xpath("//div[@id='reg_box']//descendant::div//input[@name='firstname']")).sendKeys("QWERTY");
		
		//6-Following
//		WebElement day = driver.findElement(By.xpath("//div[@id='birthday_wrapper']//following::span//select[@id='day']"));
//		Select sel = new Select(day);
//		sel.selectByIndex(10);
		
		//7-Following-Sibling
		WebElement month = driver.findElement(By.xpath("//div[@id='reg_box']//div[@id='fullname_field']//following-sibling::div[@id='birthday_wrapper']//select[2]"));
		Select sel = new Select(month);
		sel.selectByIndex(5);	
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
