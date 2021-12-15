package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class loginTest {
//// methods of accessing some stuff from another class/package :- inherit, object, by the name of class
	/// using by the name of class
	WebDriver driver; /// this connects with the browser factory class only after adding the return type web driver
	
	// Login Data
				String userName = "demo@techfios.com";
				String password = "abc123";
	
	@Test
	public void verfiedUsershouldbeabletoLogin() {
		driver=BrowserFactory.init(); 
		///LoginPage login1=new LoginPage();/// object created
		LoginPage login=PageFactory.initElements(driver,LoginPage.class);//// page factory object created
		
		login.insertUser(userName);
		login.insertPassword(password);
		login.signIn();
		
		
		DashboardPage dash= PageFactory.initElements(driver,DashboardPage.class);/// creating the object
		dash.verifyDashboard();/// calling the method
		
		
		
		///BrowserFactory.tearDown();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
