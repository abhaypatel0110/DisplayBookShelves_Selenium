package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

    public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//div[@id='password-credentials']//input[@id='spree_user_email']")
	WebElement email;
	
	@FindBy(xpath="//label[text()='Please enter a valid email address.']")
	WebElement errorMsg;
	
	
	public void enterInvalidEmail(String invalidEmail){
	     wait.until(ExpectedConditions.elementToBeClickable(email));
	     email.sendKeys(invalidEmail);
	     actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

	    
	}
	
	public String errorMessage()
	{
		return errorMsg.getText();
	}
	
	
	public void clear()
	{
		wait.until(ExpectedConditions.elementToBeClickable(errorMsg));
		email.clear();
	}
    
  
}
