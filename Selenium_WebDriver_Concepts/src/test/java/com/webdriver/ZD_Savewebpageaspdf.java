package com.webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class ZD_Savewebpageaspdf {

		@Test
		public void saveWebpageasPdf() throws Exception {
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			String testdatafilename = "Names";			
			String path = "./Testdata/"+testdatafilename+".xlsx";	
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int lastrowNo = sheet.getLastRowNum();
			System.out.println(lastrowNo);
			
			for(int i=0;i<1;i++) 
			{	
				XSSFRow row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				String name = cell.getStringCellValue();
				
				File maindir = new File("./Webpage_Document_Results");
				if(!maindir.exists()) {
					maindir.mkdirs();
				}			
				
				Cell policyno = row.getCell(1);
				String polno = policyno.getStringCellValue();
				File dir = new File("./"+maindir+"/"+polno+"_"+name);
				if(!dir.exists()) {
					dir.mkdirs();
				}
				
				if(i>0) {
					WebElement searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));
					searchBox.clear();
					Thread.sleep(500);
				}
				
				WebElement searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));
				searchBox.sendKeys(name +" AND money laundering OR aml OR Corruption OR scam OR fraud OR bribery", Keys.ENTER);
				
				driver.findElement(By.xpath("//a//div[text()='News']")).click();
				Thread.sleep(2000);
				
				for(int j=1;j<=10;j++) {
					WebElement link = driver.findElement(By.xpath("(//div[@id='appbar']/following-sibling::div//a/child::div//div[@role='heading'])["+j+"]"));	
					if(link.isDisplayed())
					{
						link.click();
						Thread.sleep(3000); 
						/*
						try {
							JavascriptExecutor js = (JavascriptExecutor) driver;
				            js.executeScript("window.stop();");							
						}
						catch(Exception e) {
							e.printStackTrace();
						}*/
					}
					else {
						break;
					}								
					
					Path printpage = Paths.get("./" + dir + "/" + polno + "_" + name + "_link_" + j + ".pdf");
					Pdf print = ((RemoteWebDriver) driver).print(new PrintOptions());
					Files.write(printpage, OutputType.BYTES.convertFromBase64Png(print.getContent()));
					Thread.sleep(1000);
					driver.navigate().back();
				}
			}
			
			
			
		}
}		
		
		
		
	


