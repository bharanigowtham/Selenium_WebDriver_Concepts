package com.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Y_AppendandSavescreenshottowordocument {

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
		
		Thread.sleep(3000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			Path outputdirectory = Path.of("./Screenshots/");
			if(!Files.exists(outputdirectory))
			{
				Assert.assertTrue(new File(String.valueOf(outputdirectory)).mkdirs(), "Unable to create output directory");
			}
			
			//Create blank word document
			XWPFDocument document;
			
			Path screenshotsDocumentpath = Path.of("./Screenshots/"+texttobeselected+".docx");
			
			if(!Files.exists(screenshotsDocumentpath))
			{
				document = new XWPFDocument();
			}
			else {
				document = new XWPFDocument(Files.newInputStream(Paths.get("./Screenshots/"+texttobeselected+".docx")));
			}
			//Create blank paragraph
			XWPFParagraph paragraph = document.createParagraph();
			
			//Add paragraph text
			XWPFRun run = paragraph.createRun();
			if(Files.exists(screenshotsDocumentpath))
			{
				run.addCarriageReturn();
				run.addCarriageReturn();
			} 
			
			run.setText("Text to be selected = " + texttobeselected);
			run.addCarriageReturn();
			run.addCarriageReturn();
			
			//Create file input stream
			File image = new File(String.valueOf(file));
			FileInputStream fisImagedata = new FileInputStream(image);
			
			//Set image type & get image name
			int imagetype = XWPFDocument.PICTURE_TYPE_JPEG;
			String imageFileName = image.getName();
			
			//Set image width & height...
			int imagewidth = 500;
			int imageheight = 250;
			
			FileOutputStream fos = new FileOutputStream(new File("./Screenshots/"+texttobeselected+".docx"));
			
			run.addPicture(fisImagedata, imagetype, imageFileName, Units.toEMU(imagewidth), Units.toEMU(imageheight));
			document.write(fos);
			
			fos.close();
			document.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println("Test completed...");
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
