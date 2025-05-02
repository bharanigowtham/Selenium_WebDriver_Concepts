package com.webdriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E_SortDropdownitems {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select sel = new Select(monthDD);
		List<WebElement> elements = sel.getOptions();
		
		ArrayList<String> originallist = new ArrayList();
		ArrayList<String> templist = new ArrayList();
		
		for(WebElement elem :elements)
		{
			originallist.add(elem.getText());
			templist.add(elem.getText());
		}
		
		System.out.println(originallist);
		System.out.println(templist);
		
		Collections.sort(templist);
		
		System.out.println(templist);
		
	}

}
