package com.app;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {
	
	

	@Test
	public void votorTest() throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","D:\\Test\\Naukri\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","D:/Test/Naukri/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();	
	
	//System.setProperty("webdriver.gecko.driver", "D:\\java\\geckodriver-v0.14.0-win64\\geckodriver.exe");

   // WebDriver driver = new FirefoxDriver();
	driver.get("http://ceoaperms.ap.gov.in/Electoral_Rolls/Rolls.aspx");
	//driver.get("http://ceoandhra.nic.in/home.aspx");
	Thread.sleep(2000);
	//driver.manage().window().maximize();
	Select dis = new Select(driver.findElement(By.xpath("//tbody/tr/td/select[@name='ddlDist']")));
	dis.selectByVisibleText("9-Nellore");
	//driver.navigate().back();
	Thread.sleep(6000);
	Select sac = new Select(driver.findElement(By.xpath("//tbody/tr/td/select[@name='ddlAC']")));
	sac.selectByVisibleText("115-Atmakur");
	Thread.sleep(2000);
	//sac.selectByValue("115");
	List<WebElement> viewsDown;
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='btnGetPollingStations']")).click();
	Thread.sleep(4000);
	
	
	viewsDown =  driver.findElements(By.xpath("//div/table[@border='0' and @cellpadding='0']/tbody/tr/td/div/div/table/tbody/tr/th[4]//../../tr/td/a"));
	
	//for(int i =0; i<viewsDown.size(); i++) {
	//}	
		Boolean buttonNotFound = true;
		System.out.println("Next Booleam ");
		while(buttonNotFound){
	if(viewsDown.size()!=0)
	{
		System.out.println("Inside If condotion");
		viewsDown.get(0).click();
		String  handle= driver.getWindowHandle();
		//System.out.println("getWindowHandle name showing " + handle);
		//Alert alert = driver.switchTo().alert();
		//String name=alert.getText();
				//6301000053
		//System.out.println("alert name showing " + name);
		
		
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		Thread.sleep(5000);
		//driver.switchTo().window(handle);
		System.out.println("after window handle and before clock text box");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).click();
		
		Thread.sleep(7000);
		System.out.println("Before Submit button");
		driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
		
		driver.switchTo().window(handle);
		
		
		buttonNotFound = true;
	}
		}	


	
	
	}

}
