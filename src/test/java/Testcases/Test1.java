package Testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Helpers.Login;


public class Test1 extends Login {

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
	
	@Test(priority=2)
	public static void ViewTime() throws InterruptedException, IOException {
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Lock Time-Track']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='item active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Approve Time-Track']")).click();
		Thread.sleep(6000);
		
		
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(loc.getProperty("Time-track"))).click();
		Thread.sleep(4000);
    	driver.findElement(By.xpath(loc.getProperty("tasks-report"))).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath(loc.getProperty("users"))).click();
 		Thread.sleep(4000);
 		
 		
		
	}
	
	
}
