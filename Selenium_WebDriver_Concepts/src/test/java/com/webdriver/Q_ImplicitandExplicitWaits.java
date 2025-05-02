package com.webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q_ImplicitandExplicitWaits {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("Title = " + driver.getTitle());
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		
		WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		Password.sendKeys("admin123");

		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.sendKeys(Keys.RETURN); //Pressing enter
		
		WebElement PIM = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")));
		PIM.click();
		
		List<WebElement> tablerows = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='orangehrm-container']//div[@class='oxd-table-body']//div[@class='oxd-table-card']")));
				
		System.out.println("Row size = " + tablerows.size());
		Thread.sleep(2000);

		driver.quit();

	}

}
