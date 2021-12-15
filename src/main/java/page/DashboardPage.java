package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
//// this class is created to assert if we are in the right dashboard
public class DashboardPage {
	
	WebDriver driver;
	
	
	public void verifyDashboard() {
		Assert.assertEquals(Dash_Element.getText(), "Dashboard", "Dashboard page not found!!!");
	}
	
	public DashboardPage(WebDriver p) {
		this.driver=p;
	}
	

	
@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement Dash_Element;
	
	@FindBy(how=How.XPATH,using="//*[@id=\\\"side-menu\\\"]/li[3]/a/span[1]") WebElement Cust_Element;
	
	@FindBy(how=How.XPATH,using="//*[@id=\\\"side-menu\\\"]/li[3]/ul/li[1]/a") WebElement Acus_Element;
	
	public void clickcustomer() {
		Cust_Element.click();
	}
	public void addcust() {
		Acus_Element.click(); 
	}
	
	
	
	
	
	
	
	
	
	
}



