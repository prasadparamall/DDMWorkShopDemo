package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class Logout extends baseclass {
	@Test
	public void logout() {
		
		click("userlogout_XPATH");
		log.info("Logout user....................");
		
		
	}  

}
