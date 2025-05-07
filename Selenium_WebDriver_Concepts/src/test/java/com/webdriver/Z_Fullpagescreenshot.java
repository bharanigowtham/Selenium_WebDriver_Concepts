package com.webdriver;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Z_Fullpagescreenshot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("Selenium");
		Thread.sleep(2000);
		String texttobeselected = "selenium ide extension";
		
		List<WebElement> listbox = driver.findElements(By.xpath("//ul[@role='listbox']//li//div//span"));
		
		for(WebElement ele :listbox)
		{
			String element = ele.getText();
			
			if(element.equalsIgnoreCase(texttobeselected))
			{
				ele.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		AShot screenshot = new AShot();
		screenshot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		screenshot.coordsProvider(new WebDriverCoordsProvider());
		
		Screenshot pagescreenshot = screenshot.takeScreenshot(driver);
		Image image = pagescreenshot.getImage();
        //BufferedImage bufferedImage = ((Object) image).getBufferedImage();
        
        File outputFile = new File("full_page_screenshot.png"); // Change the file name as needed
        //ImageIO.write(bufferedImage, "png", outputFile);

        System.out.println("Screenshot saved to: " + outputFile.getAbsolutePath());
		
	}

}
