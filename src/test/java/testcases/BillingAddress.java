package testcases;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import utilities.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseclass.baseclass;

public class BillingAddress extends baseclass{
	
	@Test(priority = 1)
	public void checkout() throws InterruptedException {
		 
		click("checkbox_XPATH");
		click("checkout_XPATH");
		Thread.sleep(2000);
		log.info("Click on Radio button and Checkout button....");
	}
	
	@Test(priority = 2)
	public void BillingAddressdropdown() throws Exception {
		
		select("dropdownclick_XPATH","New Address");
		Thread.sleep(2000);

}	
	
	@Test(priority = 3, dataProviderClass=Utilities.class, dataProvider="dp")
	public void BillingAdd(Hashtable<String,String> data) throws Exception {
				
			WebElement ftxt=returnWebElement("firstname_XPATH");
			ftxt.clear();
			ftxt.sendKeys(data.get("fname"));
			
			
			WebElement ltxt=returnWebElement("lastname_XPATH");
			ltxt.clear();
			ltxt.sendKeys(data.get("lname"));
			
			WebElement post=returnWebElement("emailbildingadd_XPATH");
			post.clear();
			post.sendKeys(data.get("email"));
			
			select("countrydrop_XPATH","India");
			
			WebElement city1 = returnWebElement("city_XPATH");
			city1.sendKeys(data.get("city"));
			WebElement add1 = returnWebElement("address1_XPATH");
			add1.sendKeys(data.get("address1"));
			WebElement add2 = returnWebElement("address2_XPATH");
			add2.sendKeys(data.get("address2"));
			WebElement	zip = returnWebElement("zipcode_XPATH");
			zip.sendKeys(data.get("zipcode"));
			WebElement phone = returnWebElement("phonenumber_XPATH");
			phone.sendKeys(data.get("phoneno"));
			
			click("bacontinue_XPATH");
			
			Thread.sleep(2000);
		
		}

}
