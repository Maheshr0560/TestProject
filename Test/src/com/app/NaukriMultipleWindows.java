package com.app;

import java.awt.Button;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NaukriMultipleWindows {
	
	@Test
	public void votorTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Test\\Naukri\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();	
	driver.get("http://www.naukri.com/");

	//driver.manage().window().maximize();
	String parent=driver.getWindowHandle();
	System.out.println(parent);

	Set<String> set= driver.getWindowHandles();

	//Iterator<String> i= set.iterator();
	//while(i.hasNext()) {
	//	String ch=i.next();
	
	for(String ch:set) {
		
		if(!parent.equals(ch)) {
			
			driver.switchTo().window(ch).getTitle();
			System.out.println(driver.switchTo().window(ch).getTitle());
			driver.close();
		}
	}
	driver.switchTo().window(parent);
	
	
	}

	
}
