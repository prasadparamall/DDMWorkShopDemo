package testcases;

import java.util.Hashtable;

import utilities.Utilities;

import org.testng.annotations.Test;

import baseclass.baseclass;

public class Login_Test extends baseclass{
	
	
	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void EnterValidCredentials(Hashtable<String,String> data) {
		click("loginlink_XPATH");
		type("email_XPATH", data.get("username"));
		type("password_XPATH",data.get("password"));
		click("loginbtn_XPATH");
	}

}
