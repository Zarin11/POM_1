package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	///constructor for page factory object
	public LoginPage(WebDriver i) {
		this.driver=i; /// connecting the web drivers
	}
	
	// Login Data
			String userName = "demo@techfios.com";
			String password = "abc123";
			
			
			/// By class
			By userNameField = By.xpath("//input[@id='username']");
			By passwordField = By.xpath("//*[@id=\"password\"]");
			By signInButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");

			/// using annotation find by for POM
	
			@FindBy(how=How.XPATH,using="//input[@id='username']") WebElement USER_Element;
			
			@FindBy(how=How.XPATH,using="//*[@id=\"password\"]") WebElement PASS_Element;
			
			@FindBy(how=How.XPATH,using="/html/body/div/div/div/form/div[3]/button") WebElement SIGN_Element;
			/// using individual methods
			public void insertUser(String userName) {
				
				USER_Element.sendKeys(userName);
				
			}
			
			public void insertPassword(String password) {
				PASS_Element.sendKeys("password");
			}
			
			public void signIn() {
				SIGN_Element.click();
				
			}
			
			////using one method for all the elements, any one of the techniques can be used
			public void performTest() {
				
				USER_Element.sendKeys(userName);
				PASS_Element.sendKeys(password);
				SIGN_Element.click();
			}
			
			
			
}
