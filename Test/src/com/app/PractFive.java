package com.app;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class PractFive {

	@Test
	public void Citi() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Test\\Naukri\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
	/*	driver.get("http://www.naukri.com/");

		String parent= driver.getWindowHandle();
		Set<String> child= driver.getWindowHandles();
		for(String chi: child) {
			
			if(!parent.equals(chi)) {
				driver.switchTo().window(chi);
				System.out.println(driver.switchTo().window(chi).getTitle());
				driver.close();
			}
		}*/
		
		String Parent= driver.getWindowHandle();
		driver.findElement(By.xpath("(//li/a[@ga-event-action='sign in'])[2]")).click();
		Thread.sleep(4000);
		driver.switchTo().window(Parent);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//li/a[@ga-event-action='sign in'])[2]")).click();
		Set<String> tabs=driver.getWindowHandles();
	
		
		for(String chi: tabs) {
			driver.switchTo().window(chi).getTitle();
			System.out.println(driver.switchTo().window(chi).getTitle());
		}
	}
}
		
		
	
