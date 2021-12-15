package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddcontactPage extends BasePage{

	WebDriver driver;
	public void AddcontactPage(WebDriver r) {
		this.driver=r;
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\\\"account\\\"]") WebElement Full_Element;
	@FindBy(how=How.XPATH,using= "//*[@id=\"cid\"]")   WebElement Com_Element;
	@FindBy(how=How.XPATH,using="//*[@id=\\\"email\\\"]") WebElement Email_Element;
	@FindBy(how=How.XPATH,using="") WebElement Phone_Element;

	@FindBy(how=How.XPATH,using=  "//select[@id='country']") WebElement Con_Element;
	
	
	public void insertFullname(String userName) {
	
		
		Full_Element.sendKeys(userName+ generatRandomno(999));
		
		
	}
	public void selectCompany2(String company) {
		selectfromDrop(Com_Element,company);

	
	}
public void insertemail(String email) {
	
		
		Email_Element.sendKeys(email+ generatRandomno(999));
		
		
	}
	


public void insertphone(String phone) {
	
	
	Phone_Element.sendKeys(phone+ generatRandomno(99));
	
	
}



public void selectcountry(String country) {
	
	
	selectfromDrop(Con_Element,country);
	
	
}


}


