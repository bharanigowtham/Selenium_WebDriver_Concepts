package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_DropdownwithoutSelmethods {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement dateDD = driver.findElement(By.id("day"));
		Select sel = new Select(dateDD);
		List<WebElement> elements = sel.getOptions();
		
		for(WebElement ele:elements)
		{
			if(ele.getText().equals("15"))
			{
				ele.click();
				break;
			}
		}
		
		WebElement monthDD  =driver.findElement(By.id("month"));
		Select sel2 = new Select(monthDD);
		List<WebElement> elems = sel2.getOptions();
		for(WebElement e:elems)
		{
			if(e.getText().equalsIgnoreCase("Apr"))
			{
				e.click();
				break;
			}
		}
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select s = new Select(yearDD);
		List<WebElement> yrelem = s.getOptions();
		for(WebElement yr : yrelem)
		{
			if(yr.getText().equals("1998"))
			{
				yr.click();
				break;
		 }
		}
		
		
		
		
		
	}

}
