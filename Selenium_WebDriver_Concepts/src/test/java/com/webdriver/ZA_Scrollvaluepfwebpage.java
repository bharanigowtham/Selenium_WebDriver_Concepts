package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZA_Scrollvaluepfwebpage {

	public static void main(String[] args) throws InterruptedException {
/*
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		long scrolly = (long) ((JavascriptExecutor) driver).executeScript("return window.pageYOffset;");
		System.out.println("Vertical position of scroll : " + scrolly);
		
		Thread.sleep(2000);
		
		WebElement elementToScrollTo = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")); 
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementToScrollTo);
        
        double scrollYAfterScroll = (double) ((JavascriptExecutor) driver).executeScript("return window.pageYOffset;");
        System.out.println("Vertical scroll position after scrolling to element: " + scrollYAfterScroll);
		
        Thread.sleep(3000);
        
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
        
        
		Thread.sleep(5000);
		driver.close(); */
		
		
		String str = "Hello";
        int num = 10;
        double decimal = 3.14;
        boolean flag = true;
        Long lg = (long) 1234;

        System.out.println("The data type of str is: " + str.getClass().getName());
        System.out.println("The data type of lg is: " + lg.getClass().getName());

//        System.out.println("The data type of num is: " + num.getClass().getName()); // This will throw a compile-time error
//        System.out.println("The data type of decimal is: " + decimal.getClass().getName()); // This will throw a compile-time error
//        System.out.println("The data type of flag is: " + flag.getClass().getName()); // This will throw a compile-time error

        Integer numObj = 10;
        Double decimalObj = 3.14;
        Boolean flagObj = true;

         System.out.println("The data type of numObj is: " + numObj.getClass().getName());
         System.out.println("The data type of decimalObj is: " + decimalObj.getClass().getName());
        System.out.println("The data type of flagObj is: " + flagObj.getClass().getName());

	}

}
