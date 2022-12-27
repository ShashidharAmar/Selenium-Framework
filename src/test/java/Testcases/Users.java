package Testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Helpers.Login;



public class Users extends Login {
	
	@Test(priority=1)
	public void m1() throws InterruptedException
	{
     String log = driver.getTitle();
    	String log1="actiTIME - Login"; 
    if(log.equalsIgnoreCase(log1)) {
	LoginPage a1=new LoginPage();
	a1.LoginTest();
	}
	}
	
	
	@Test (priority=2)
	public static void user() throws InterruptedException {

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		Thread.sleep(6000);
		
		driver.findElement(By.xpath(loc.getProperty("users"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("PTO-Settings"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("Sick-day-setting"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("Work-Assignment"))).click();
		Thread.sleep(3000);
	
	}

}
