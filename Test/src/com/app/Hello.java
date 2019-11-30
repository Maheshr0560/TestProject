package com.app;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello {


	//Excel excel=new Excel();
	WebDriver driver;//=null;
	
	@Test
	public void login() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Test\\Naukri\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get(excel.getData(0, 1, 3));
		driver.get("https://www.w3schools.com/");

		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div/a[contains(text(),'Learn Colors')])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']")).sendKeys(excel.getData(0,1,4));
	}
	
}
