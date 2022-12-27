package Practice;
 
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Execute extends Dropdown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        
        Dropdown loginPage = new Dropdown();

        PageFactory.initElements(driver, loginPage);
       
		loginPage.login("user", "pass");
			
		System.out.println(driver.getTitle());
	
        driver.quit();
        
       
	}
}
