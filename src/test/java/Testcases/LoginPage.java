package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Helpers.Login;

public class LoginPage extends Login
{
		@Test
		public void LoginTest() throws InterruptedException
		{
			driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys("admin");
			driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys("manager");
			driver.findElement(By.xpath(loc.getProperty("Login_button"))).click();
			Thread.sleep(4000);	
			
			System.out.println(driver.getTitle());
			
		
		}
		                                                        
}



//driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys("admin");
//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();



//@Test(dataProvider = "data-provider")
//public static void LoginTest(String username, String pwd) throws InterruptedException
//{
//	driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys(username);
//	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
//	
//}
//
//@DataProvider (name = "data-provider")
// public Object[][] dpMethod(){
// return new Object[][] {
//	 {"First-Value","S-Value"},
//     {"FirValue","Second-Value"},
//     {"First-alue","Scondue"},
//     {"First-Value","Seconlue"},
//     {"admin","manager"}};




