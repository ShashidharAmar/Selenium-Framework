package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dropdown {
	
	@FindBy(id="email")
	WebElement username1;
	
	@FindBy(id="pass")
	WebElement password1;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement LoginButton;
	
	
	public void login(String username, String password)
	{
   
		username1.sendKeys(username);
		
		password1.sendKeys(password);
		
		LoginButton.click();
		
       
	
	
	}
}
