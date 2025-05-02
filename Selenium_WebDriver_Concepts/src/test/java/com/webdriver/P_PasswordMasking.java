package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_PasswordMasking {

	private static Properties prop;
	private static final String SECRET_KEY = "bharaniatomation";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		System.out.println("Title = " + driver.getTitle());

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		readProp();
		String encryptpwd = prop.getProperty("password");
		
		driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys(Decrypt(encryptpwd));
				
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);

		driver.quit();
		
//		String encryptpwd = Encrypt("admin123");
//		System.out.println(encryptpwd);

	}
	
	public static Properties readProp()
	{
		prop=new Properties();
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return prop;
	}

	public static String Encrypt(String strtoEncrypt) {
		try 
		{
			SecretKeySpec secretkeyspec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretkeyspec);
			return Base64.getEncoder().encodeToString(cipher.doFinal(strtoEncrypt.getBytes()));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public static String Decrypt(String strtoEncrypt) {
		try 
		{
			SecretKeySpec secretkeyspec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, secretkeyspec);
			return 	new String(cipher.doFinal(Base64.getDecoder().decode(strtoEncrypt.getBytes())));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

}
