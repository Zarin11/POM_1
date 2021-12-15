package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddcontactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddcontactTest {
WebDriver driver;
	@Test
	public void verifiedUser() {
		
		
		driver=BrowserFactory.init();
		LoginPage login=PageFactory.initElements(driver,LoginPage.class);
		
		login.insertUser("demo@techfios.com");
		login.insertPassword("abc123");
		login.signIn();
		DashboardPage dash= PageFactory.initElements(driver,DashboardPage.class);/// creating the object
		dash.verifyDashboard();/// calling the method
		dash.clickcustomer();
		dash.addcust();
		
		AddcontactPage ad=PageFactory.initElements(driver, AddcontactPage.class);
		ad.insertFullname("TestNG");
		ad.insertemail("abc123@techfios.com");
		ad.insertphone("");
		ad.selectCompany2("Techfios");
		ad.selectcountry("Angola");
		
		
		
		
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
