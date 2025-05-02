package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M_XpathAxes {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		
		//1 - Self 
		String textname = driver.findElement(By.xpath("//a[contains(text(),'Haryana Leather')]/self::a")).getText(); //Haryana Leather
		System.out.println(textname);
				
		//2-Parent
		String textname1 = driver.findElement(By.xpath("//a[contains(text(),'Haryana Leather')]/parent::td")).getText(); //Haryana Leather		
		System.out.println(textname1);
		
		//3-Child - Accessing child from ancestor node
		List<WebElement> textname2 = driver.findElements(By.xpath("//a[contains(text(),'Haryana Leather')]/ancestor::tr/child::td"));
		System.out.println(textname2.size()); //6
		
		//4-Child - Accessing child from parent node
		String textname3 = driver.findElement(By.xpath("//a[contains(text(),'Haryana Leather')]/parent::td/child::a")).getText();  //Haryana Leather	
		System.out.println(textname3); 
		
		//5-Ancestor
		String textname4 = driver.findElement(By.xpath("//a[contains(text(),'Haryana Leather')]/ancestor::tr")).getText(); // Entire row....Haryana Leather X 73.89 83.90 + 13.55 Buy  |  Sell		
		System.out.println(textname4);
		
		//6- Descendant - Accessing child from ancestor node using descendant (Child, Grandchild) -- Same result as 3 & 5....
		List<WebElement> textname5 = driver.findElements(By.xpath("//a[contains(text(),'Haryana Leather')]/ancestor::tr/descendant::td"));
		System.out.println(textname5.size());
		
		//7 - Following 
		List<WebElement> textname6 = driver.findElements(By.xpath("//a[contains(text(),'Haryana Leather')]/ancestor::tr/following::tr"));
		System.out.println("No of following nodes after Haryana leather's ancestor = "+textname6.size()); //Each Rows below haryana leather
		
		//8-Following-Sibling
		List<WebElement> textname7 = driver.findElements(By.xpath("//a[contains(text(),'Haryana Leather')]/ancestor::tr/following-sibling::tr"));
		System.out.println("No of following nodes after Haryana leather's ancestor using following sibling = "+textname7.size()); //Each Rows below haryana leather
		
		//9-Preceding
		List<WebElement> textname8 = driver.findElements(By.xpath("//a[contains(text(),'Haryana Leather')]/ancestor::tr/preceding::tr"));
		System.out.println("No of preceding nodes before Haryana leather's ancestor = "+textname8.size()); //Each Rows above haryana leather
		
		//10-Preceding-Sibling (Rows)
		List<WebElement> textname9 = driver.findElements(By.xpath("//a[contains(text(),'Haryana Leather')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("No of preceding sibling nodes before Haryana leather's ancestor = "+textname9.size()); //Each Rows above haryana leather
		
		//11-Preceding-Sibling - Each Data
		List<WebElement> textname10 = driver.findElements(By.xpath("//a[contains(text(),'Haryana Leather')]/ancestor::tr/preceding-sibling::tr/td"));
		System.out.println("No of DATA in preceding sibling nodes before Haryana leather's ancestor = "+textname10.size()); //Each single data in Rows above haryana leather
		
		driver.quit();
		
		
		//		String textname1 = driver.findElement(By.xpath("")).getText(); //Haryana Leather

	}
}
