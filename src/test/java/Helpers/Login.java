package Helpers;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
		public static WebDriver driver;
		public static Properties ps =new Properties();
		public static Properties loc=new Properties();
		public static FileReader fr;
		public static FileReader fr1;
		
		
		@BeforeTest
		public void Setup() throws IOException
		{
			if(driver==null) {
				
				FileReader fr= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\ConfigFile\\browserLaunch");
				ps.load(fr);
				
				FileReader fr1=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Locators\\LoginLoc");
				loc.load(fr1);
				
			}
	
			
			if(ps.getProperty("browser").equalsIgnoreCase("chrome")) {
				
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get(ps.getProperty("test_link"));
			}
			else if(ps.getProperty("browser").equalsIgnoreCase("Firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.get(ps.getProperty("test_link"));
			}
		}
		
		@AfterTest
		public void TearDown()
		{
			driver.quit();
			System.out.println("Testcase passed succesfully");
		}
	
		
		
	

}
